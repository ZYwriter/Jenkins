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
        emailext(subject: '$DEFAULT_SUBJECT',recipientProviders: [[$class: 'RequesterRecipientProvider']], body: '$DEFAULT_CONTENT', replyTo: '$DEFAULT_REPLYTO', postsendScript: '$DEFAULT_POSTSEND_SCRIPT', presendScript: '$DEFAULT_RECIPIENTS', to: '$recipientProviders')
      }
    }
  }
}
