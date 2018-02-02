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
}
