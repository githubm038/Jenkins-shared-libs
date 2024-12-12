def call (string ProjectName, string ImageTag, string DockerHubUser){
    echo 'Build Takes Here..'
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
