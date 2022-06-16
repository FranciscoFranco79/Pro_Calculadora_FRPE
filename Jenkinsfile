pipeline {
    agent any
  
  stages {
    
    stages ('Unit Tests') {
      steps {
          sh "mvn clean compile test"
      }
    }
    
    stage ('Compile Pro_Calculadora_FRPE') {
      steps {
        sh "mvn -f pom.xml clean install -Dmaven.test.skip=true"
      }
    }
  }
}
