#!/usr/bin/env groovy

def call(){
    echo "Pushing the Build Image into the ACR repo through shared library concept"
      docker.withRegistry( "http://${registryUrl}", registryCredential ) {
      dockerImage.push()    
}
    
return this
