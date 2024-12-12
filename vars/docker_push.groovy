def call (String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId:"DockerHubCred",
  passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    sh "docker login -u ${dockerhubuser} -p ${dockerHubPass}"
    sh "docker image tag ${Project}:${ImageTag} ${dockerhubuser}/${Project}:${ImageTag}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
