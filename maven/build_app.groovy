void call(){
	stage "Build maven app", {
	node{
		unstash "workspace"
		sh "pwd"
		sh "mvn clean install"
		stash "workspace"
      }

    }
}
