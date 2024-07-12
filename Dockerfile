FROM eclipse-temurin:17-jdk-focal
ENV HOME /root
COPY ./build/libs/test-*.jar /root/test.jar
WORKDIR /root/
CMD [ "java","jar","/root/test.jar" ]