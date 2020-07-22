docker build -t demogvm-build .
docker run -v ${PWD}:/usr/src/app --name temp --rm demogvm-build mvn clean package
docker run -v ${PWD}:/usr/src/app --name temp --rm demogvm-build native-image --no-fallback -jar target/spring-graal-native-image-0.0.1-SNAPSHOT.jar
./demoGVM-0.0.1-SNAPSHOT