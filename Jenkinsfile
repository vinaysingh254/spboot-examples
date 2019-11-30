node {
    stage('SCM Checkout'){
        git branch: 'v1', credentialsId: 'Test', url: 'https://github.com/vinaysingh254/spboot-examples.git'
    }
    stage('Build Docker Image'){
        def mvnHome = tool name: 'Maven-3', type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        bat "${mvnCMD} clean package dockerfile:build -Pdocker"
    }
    stage('Push Docker Image'){
        withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPwd')]) {
            bat "docker login -u vinaysingh913 -p ${dockerHubPwd}"
        }
        bat 'docker push vinaysingh913/spring-boot-aop:1.0-SNAPSHOT'
    }
    stage('Run Container on Local Server'){
      bat 'docker-compose -f docker-compose.yml up -d dkspringbootaop'
    }
    sshagent(['remoteDockerserver']) {
    def dockerRun='docker-compose -f docker-compose.yml up -d dkspringbootaop'
        sh "ssh -o StrictHostKeyChecking=no vsingh@127.0.0.1 ${dockerRun}"
    }
}
