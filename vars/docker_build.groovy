def call (String ProjectName, String ImageTag, String DockerHubUser){
    echo 'Build Takes Here..'
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
