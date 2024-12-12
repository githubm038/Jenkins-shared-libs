def call (String Project, String ImageTag, String DockerhubUser){
  echo 'Pushing an image to DockerHub...'
  withCredentials([usernamePassword(credentialsId:"DockerHubCred",
  passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"}
  sh "docker push ${env.dockerHubUser}/${Project}:${ImageTag}"
}
