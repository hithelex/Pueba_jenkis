def nombre = "Edin"

def callToActions(String nombre) {
    echo "Hola, ${nombre}, bienvenido al pipeline."
}

def executeEdin() {
    echo "Ejecutando la prueba para Edin..."
}

def nuevaPrueba() {
    echo "Ejecutando una nueva prueba en el stage_EDIN..."
}

try {
    node {
        stage('Saludo de pipeline') {
            callToActions(nombre)
        }
        stage('Prueba Edinnnn') {
            executeEdin()
        }
        stage('Prueba de un nuevo stage_EDIN') {
            nuevaPrueba()
        }            
    }
} catch (e) {
    echo "Error: ${e}"
    throw e
}
