pipeline {
    agent any

    tools {
        // This tells Jenkins to use the Maven tool you have configured
        // in Manage Jenkins > Global Tool Configuration.
        // You might need to adjust the name 'Maven' if yours is different.
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                // This is the standard way to check out the code
                // using the repository URL from the job's configuration.
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                // Using 'bat' for Windows. Use 'sh' if Jenkins is on Linux/macOS.
                bat 'mvn clean package'
            }
        }
    }
}