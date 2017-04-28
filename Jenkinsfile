pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                docker.image('maven:3.5.0-jdk-8').inside {
                    sh "mvn clean test"
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}