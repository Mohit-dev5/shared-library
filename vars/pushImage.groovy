#!/usr/bin/env groovy

def call(){
    echo "Pushing the Build Image into the ACR repo through shared library concept"
        //Use Below Comments when using Dockerhub
        //withCredentials([usernamePassword(credentialsId: 'ACR', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        //sh 'docker build -t advisingbank/demo-app .'
        //sh "echo $PASS | docker login -u $USER --password-stdin"
        //sh 'docker push nanajanashia/demo-app:jma-2.0'
      docker.withRegistry( "http://${registryUrl}", registryCredential ) {
      dockerImage.push()    
}
