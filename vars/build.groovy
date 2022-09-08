#!/usr/bin/env groovy

def call(String mvnaction) {
    
       if ("${mvnaction}" == "Clean")
                    {
                    sh "mvn clean"
                    }
               else if ("${mvnaction}" == "Sonar")
                    {
                    sh "mvn sonar:sonar"
                    }
               else if ("${mvnaction}" == "Compile")
                    {
                    sh "mvn clean compile"
                    }
               else if ("${mvnaction}" == "Test")
                    {
                    sh "mvn clean test"
                    }
               else if ("${mvnaction}" == "Install")
                    {
                    sh "mvn clean install"
                    }
}

return this 
