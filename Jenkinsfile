pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''mvn -v
echo something'''
      }
    }
    stage('Test') {
      steps {
        emailext(
        subject: '$DEFAULT_SUBJECT',
        recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
        body: '$DEFAULT_CONTENT'
        )
      }
    }
  }
   post {
        success {  
          emailext (
            subject: "${env.JOB_NAME} - Build# ${env.BUILD_NUMBER} - Successful!",
            
            recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']],
            body: '$DEFAULT_CONTENT',  
                    
          )
        }

        failure {
          emailext (
            subject: "${env.JOB_NAME} - Build# ${env.BUILD_NUMBER} - Successful!",
            
            recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider'], [$class: 'FailingTestSuspectsRecipientProvider']],  
            body: '$DEFAULT_CONTENT',
          )
        }
    }
}
