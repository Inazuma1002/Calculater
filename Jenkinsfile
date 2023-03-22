pipeline {
    agent any
    
    environment
    {
        registry = "manas2024/calculator"
        registryCredential = "dockerhub_token"
        dockerImage = ""
    }

    stages {
        
        stage('git pull') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/Inazuma1002/Calculater.git'
            }
        }
        
         stage('Maven Build') {
            steps {
                // Maven build, 'sh' specifies it is a shell command
                sh 'mvn clean install'
            }
        }
        
//         stage('build docker image') {
//             steps {
//                 script {
//                     dockerImage = docker.build(registry + ":latest")
//                 }
//             }
//         }
    }
}
