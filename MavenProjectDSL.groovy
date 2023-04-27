job("First-Maven-Project-via-DSL"){
    description("First maven job using DSL on ${new Date()} ")
    scm{
        git("https://github.com/nihalmirza23/Jenkins-mevan.git","master")
    }
    triggers{
        scm('* * * * *')
    }
    steps{
        maven("test compile package","Jenkins-maven/jenkinsdem0/pom.xml")
    }
    publishers{
        archiveArtifacts '**/*.jar'
    }
}