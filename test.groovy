import java.io.*



 example1 = { List<String> list  ->



    def newFile = new File("/var/lib/jenkins/workspace/groovy/vars" ,"test.txt").createNewFile()

        def newFile1 = new File("/var/lib/jenkins/workspace/groovy/vars" ,"test.txt").withWriter {

            writer -> $list.each {
                line -> writer.writeLine(line)

            }

        }








}

def example2() {
    println 'Hello from example2'
}

return this



    //Method Requiring Script Approval Here
