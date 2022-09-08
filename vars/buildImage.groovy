#!/usr/bin/env groovy

def call(){
    echo "building the docker image through Shared Library vars/groovy file"
    dockerImage = docker.build registryName + ":$BUILD_NUMBER"
    echo "Pushing the Build Image into the ACR repo through shared library concept"
    docker.withRegistry( "http://${registryUrl}", registryCredential ) {
    dockerImage.push()    
}
