def call(String url, String credentialsId, String branch) {
                echo 'Git clone started'
                git branch: "${branch}", url: "${url}", credentialsId:"${credentialsId}"
                echo 'Git clone completed'
}
