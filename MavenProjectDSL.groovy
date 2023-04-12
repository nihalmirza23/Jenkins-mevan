job("First-Maven-Project-via-DSL"){
    description("First maven job using DSL on ${new Date()} ")
    scm{
        git("https://github.com/gaurav0122/jenkins-demo.git","master")
    }
    triggers{
        scm('* * * * *')
    }
    steps{
        maven("test compile","Jenkins-maven/jenkinsdem0/pom.xml")
    }
    publishers{
        archiveArtifacts '**/*.jar'
    }
}