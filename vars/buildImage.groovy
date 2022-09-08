#!/usr/bin/env groovy

def call(){
    echo "building the docker image through Shared Library vars/groovy file"
    dockerImage = docker.build registryName + ":$BUILD_NUMBER"
}
