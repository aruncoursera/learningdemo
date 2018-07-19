rm -rf bin/*
rm -rf etc
rm -rf output/*

javac -cp .:bin -d bin/ src/src/mf/com/*.java
javac -cp .:bin -d bin/ src/src/mf/com/MessageCreator.java
javac -cp .:bin -d bin/ src/src/mf/com/FileGenerator.java
javac -cp .:bin -d bin/ src/src/mf/com/CreateContent.java

javac -cp .:bin:ext/* -d bin/ src/src/mf/com/TestMessageCreator.java
java -cp .:bin:ext/* org.junit.runner.JUnitCore src.mf.com.TestMessageCreator


java -cp .:bin:ext/* src.mf.com.CreateContent

tar -cvf hiddenmessages.tar etc/

mkdir -p output/
cp hiddenmessages.tar  output/
