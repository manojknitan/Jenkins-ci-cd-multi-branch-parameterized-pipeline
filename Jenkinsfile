pipeline {
  agent any
  stages {
    stage ('Checkout')
    {
      steps {
        git branch: 'dev',
          url: "https://github.com/manojknitan/Jenkins-ci-cd-multi-branch-parameterized-pipeline.git",
          credentialsId: 'Github-Private-PAT'
      }
    }

    stage ('Build & Test')
    {
      steps {
        bat "mvn clean test"
      }
    }
}

}
