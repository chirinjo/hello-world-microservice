pipeline {
    agent any

    environment {
        // Define environment variables here
        // EXAMPLE_VAR = 'example_value'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building the application...'
                // Add your build commands here
                // sh 'npm install'
                // sh 'mvn clean compile'
                // sh 'docker build -t myapp .'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add your test commands here
                // sh 'npm test'
                // sh 'mvn test'
                // sh 'pytest'
            }
        }

        stage('Code Quality') {
            steps {
                echo 'Running code quality checks...'
                // Add code quality tools here
                // sh 'eslint .'
                // sh 'sonar-scanner'
            }
        }

        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                echo 'Deploying application...'
                // Add deployment commands here
                // sh 'kubectl apply -f k8s/'
                // sh 'docker push myregistry/myapp:${BUILD_NUMBER}'
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed'
            // Clean up workspace
            cleanWs()
        }
        success {
            echo 'Pipeline succeeded!'
            // Add success notifications here
            // emailext to: 'team@company.com', subject: 'Build Success', body: 'Build completed successfully'
        }
        failure {
            echo 'Pipeline failed!'
            // Add failure notifications here
            // emailext to: 'team@company.com', subject: 'Build Failed', body: 'Build failed. Please check the logs.'
        }
    }
}