pipeline {
    
	agent any
    
	environment {
        CI = 'true'
    }
    
	stages {
        stage('code') {
			//for more details check https://jenkins.io/doc/book/pipeline/syntax/#built-in-conditions
			//Assuming Tester don't want frequent builds
			when {
				not {
					branch 'testing'
				}			
            }
            steps {
				//Build your code
				//Run your Unit Tests if you are TDD guy
				//Add steps to checkin to Main Branch
				//Add Steps to bundle
				sh "cd HiddenMessage/ ; sh build.sh"
	        }
        }
	
		stage('Deploy') {
		    //agent { docker 'YOUR TEST DOCKER NAME' } ensure global agent is none to leverage this
			//Assuming Developer don't worry about Deployments
     		when {
				not {
					branch 'production'
				}
            }
			
            steps {
                sh "echo $pwd"
				//Add steps to bundle
				//Run Your Tests
				sh "mkdir -p ~/testdir; cd  ~/testdir "
				sh "wget https://github.com/aruncoursera/learningdemo/blob/master/HiddenMessage/output/hiddenmessages.tar"
				sh "tar -xvf hiddenmessages.tar"
    	
			}
        }
        
		stage('Test') {
			//agent { docker 'YOUR TEST DOCKER NAME' } ensure global agent is none to leverage this
			//Assuming Developer don't worry about Deployments
     		when {
				not {
					branch 'production'
				}
            }
	        steps {
                sh "echo $pwd"
				javac -cp .:bin:ext/* -d bin/ src/test/mf/com/*.java
				java -cp .:bin:ext/* org.junit.runner.JUnitCore test.mf.com.CheckHiddenMessage
				
	        }
        }
    }
}