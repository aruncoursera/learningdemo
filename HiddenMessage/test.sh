set -xe

javac -cp .:bin:ext/* -d bin/ src/test/mf/com/*.java
java -cp .:bin:ext/* org.junit.runner.JUnitCore test.mf.com.CheckHiddenMessage
