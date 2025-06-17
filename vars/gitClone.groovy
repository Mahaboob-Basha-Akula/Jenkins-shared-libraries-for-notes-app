def call(String url, string credentialsId, String branch) {
                echo 'Git clone started'
                git branch: "${branch}", url: "${url}", credentialsId:"${credentialsId}"
                echo 'Git clone completed'
}
