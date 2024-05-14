@Library('shared-library@master')

import sharedLibrary.toolsJenkisn

def tools = new toolsJenkisn(steps, this)
def nombre = "Edin"

try {
    node {
        stage('Saludo de pipeline') {
            tools.callToActions("${nombre}" as String)
        }
        stage('execute hello') {
            tools.executeFuncion()
        }
    }
} catch (e) {
    //tools.notifySlack("Error: ${e}")
    throw e
}