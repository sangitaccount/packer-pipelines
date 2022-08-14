pipeline {
  agent any

  stages {
    stage('Packer - Build Docker Image') {
      steps {
        sh """
        #!/bin/bash
        cd jenkins-tutorial/AWS
        packer init .
        packer build -force .
        """
      }
    }
  }
}
