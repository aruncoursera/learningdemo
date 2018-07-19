pipeline {
    agent any
    environment {
        CI = 'true'
    }
    stages {
        stage('Build') {
			when {
                branch 'production'
            }
            steps {
                sh "echo $pwd"
            }
        }
        stage('Test') {
			when {
                branch 'testing'
            }
            steps {
                sh "echo $pwd"
            }
        }
    }
}