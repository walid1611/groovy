node {


stage('test') {

checkout scm

}




stage ('load groovy') {

 code = load 'test.groovy'

}


stage ('excute groovy') {

def outputLines = [
    'Line one of output example',
    'Line two of output example',
    'Line three of output example'
]

 code.example1(outputLines)
}



}



































