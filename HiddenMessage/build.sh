set -x
set -e

################################################
quit_on_error () {
	echo "Status : $1"
	if ! [[ $1 == *200*OK* ]]; then
        echo "Failed Status : $1"
        exit 1
	fi

}
################################################

rm -rf bin/*
rm -rf etc
rm -rf output/*

## Build Code
javac -cp .:bin:ext/* -d bin/ src/src/mf/com/*.java

##Unit Test
java -cp .:bin:ext/* org.junit.runner.JUnitCore src.mf.com.TestMessageCreator

## Create Content
java -cp .:bin:ext/* src.mf.com.CreateContent

## Package Content
tar -cvf hiddenmessages.tar etc/

## Place Content
mkdir -p output/
mv hiddenmessages.tar  output/
