import java.io.*



def example1() {

    def outputLines = [
            'Line one of output example',
            'Line two of output example',
            'Line three of output example'
    ]



        def newFile = new File("/var/lib/jenkins/workspace/groovy/vars" ,"test.txt")

                .withWriter {

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
