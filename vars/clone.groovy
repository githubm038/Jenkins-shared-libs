def call (String url, String branch){
  echo 'Code Takes Here...'
  git url: "${url}", branch: "${branch}"
  echo "code clone is sucessfull.."
}
