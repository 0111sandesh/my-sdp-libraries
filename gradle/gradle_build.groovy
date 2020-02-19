void call(){
	stage "Build gradle app", {
	node{
		sh "pwd"
		sh "./gradlew build"
		sh "md5sum /var/jenkins_home/workspace/sample-myGithub_master/build/libs/gs-spring-boot-0.1.0.jar"
      }

    }
}
