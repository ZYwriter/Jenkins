pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -v'
      }
    }
    stage('Test') {
      steps {
        emailext(subject: '$DEFAULT_SUBJECT', attachLog: true, compressLog: true, body: '$DEFAULT_CONTENT', to: 'xiaopan@xceder.com', replyTo: '$DEFAULT_REPLYTO', postsendScript: '$DEFAULT_POSTSEND_SCRIPT', presendScript: '$DEFAULT_RECIPIENTS')
      }
    }
  }
}