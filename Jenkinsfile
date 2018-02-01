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
        emailext(subject: '${env.BUILD_ID}', attachLog: true, compressLog: true, body: '${env.BUILD_LOG}', to: 'xiaopan@xceder.com')
      }
    }
  }
}