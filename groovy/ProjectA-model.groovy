node('scriptserver') {
	stage('Stage 1'){
		echo 'Hello World 1'
		sh 'df -m'
	}
	stage('Stage 2'){
		echo 'Hello World 2'
		sh 'ls -l'
	}
 }