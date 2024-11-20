pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/a-matta/testing_demo_playwright_python.git'
            }
        }
        stage('Hello') {
            steps {
                python --version
            }
        }
    }
}
