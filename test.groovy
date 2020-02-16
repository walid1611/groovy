import java.io.*

def outputLines = [
        'Line one of output example',
        'Line two of output example',
        'Line three of output example'
]

def example1() {





        def newFile1 = new File("/var/lib/jenkins/workspace/groovy/vars" ,"test.txt").append {

            writer -> outputLines.each {
                line -> writer.writeLine(line)

            }

        }








}

def example2() {
    println 'Hello from example2'
}

return this



    //Method Requiring Script Approval Here
