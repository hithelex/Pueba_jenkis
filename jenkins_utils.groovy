@Library('shared-library@edin')

import sharedLibrary.toolsJenkisn

def tools = new toolsJenkisn(steps, this)
def nombre = "Edin"

try {
    node {
        stage('Saludo de pipeline') {
            tools.callToActions("${nombre}" as String)
        }
        stage('execute hello') {
            tools.executeEdin()
        }
    }
} catch (e) {
    //tools.notifySlack("Error: ${e}")
    throw e
}
