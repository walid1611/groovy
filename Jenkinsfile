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


def Apppend_File = { List ss ->


    for (i  in $ss ){
        def newFile1 = new File("/var/lib/jenkins/workspace/groovy/vars" ,"test.txt").append("\n"+i)

    }


assert Apppend_File(outputLines)




}







}


}
































