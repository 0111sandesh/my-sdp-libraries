void call(){
	stage "Deploy", {
	node{
        sh "docker rm -f my-sample-app || true"
	sh "docker run -d -p 80:8080 --name my-sample-app 0.0.0.0:5000/sdp-labs-sample-app:${env.GIT_SHA}"
      }

    }
}
