void call(){
	stage "Build gradle app", {
	node{
		sh "pwd"
		sh "./gradlew build"
      }

    }
}
