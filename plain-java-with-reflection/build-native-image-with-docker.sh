docker run -v ${PWD}:/usr/src/app --name temp --rm plain-java-build mvn clean package
docker run -v ${PWD}:/usr/src/app --name temp --rm plain-java-build native-image -jar target/plain-java-with-reflection-1.0-SNAPSHOT.jar
./plain-java-with-reflection-1.0-SNAPSHOT