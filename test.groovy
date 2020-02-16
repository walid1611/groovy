def example1() {


    try {
    def lis  = new File( "/var/lib/jenkins/workspace/groovy",'haiku.txt') as String []
    lis[0]
    } catch(e) {
        echo 'There was an error'
    }
}

def example2() {
    println 'Hello from example2'
}

return this



    //Method Requiring Script Approval Here
