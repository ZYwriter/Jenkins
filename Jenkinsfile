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
        emailext(subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', attachLog: true, compressLog: true, body: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:  Check console output at $BUILD_URL to view the results.', to: 'xiaopan@xceder.com')
      }
    }
  }
}