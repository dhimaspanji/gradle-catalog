pipeline {
    agent any

    environment {
        ARTIFACTORY_USER = credentials('nexus-credentials')
        ARTIFACTORY_PASSWORD = credentials('nexus-credentials')
    }

    tools {
        gradle 'gradle-8' // Sesuaikan dengan Gradle version di Jenkins Global Tools
        jdk 'jdk17'       // Sesuaikan juga Java-nya
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/dhimaspanji/foundation-catalog.git'
            }
        }

        stage('Publish to Nexus') {
            steps {
                sh './gradlew publish'
            }
        }
    }
}
