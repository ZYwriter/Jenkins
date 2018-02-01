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
        emailext(subject: 'default', attachLog: true, compressLog: true, body: 'default', to: 'xiaopan@xceder.com')
      }
    }
  }
}