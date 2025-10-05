pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // This step is handled automatically when we configure the job later.
                // It will check out the code from GitHub.
                echo 'Checking out code...'
            }
        }
        stage('Build & Test') {
            steps {
                // This single Maven command compiles the code,
                // runs your JUnit tests, and packages it all into a .jar file.
                sh 'mvn clean package'
            }
        }
    }
}