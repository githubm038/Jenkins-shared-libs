def call (String Project, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId:"DockerHubCred", passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    sh "docker image tag ${Project}:${ImageTag} ${dockerHubUser}/${Project}:${ImageTag}"
  }
  sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
