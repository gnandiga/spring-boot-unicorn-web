pipeline {
    agent any

    stage('Build') {
        docker.image('maven:3.5.0-jdk-8').inside {
            sh "mvn clean test"
        }
    }
}