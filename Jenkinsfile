pipeline {
    agent any

    environment {
        ARTIFACTORY_USER = credentials('nexus-credentials')
        ARTIFACTORY_PASSWORD = credentials('nexus-credentials')
    }

    tools {
        gradle 'gradle-8'
        jdk 'jdk17'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/dhimaspanji/gradle-catalog.git'
            }
        }

        stage('Publish to Nexus') {
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew publish'
            }
        }
    }
}
