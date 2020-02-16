import groovyjarjarantlr.collections.List

import java.io.*

def outputLines = [
        'Line one of output example',
        'Line two of output example',
        'Line three of output example'
]

def Apppend_File = { List ss ->


    for (i  in $ss ){
        def newFile1 = new File("/var/lib/jenkins/workspace/groovy/vars" ,"test.txt").append("\n"+i)

    }












}

def example2() {
    println 'Hello from example2'
}

return this



    //Method Requiring Script Approval Here
