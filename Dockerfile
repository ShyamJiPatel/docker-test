FROM openjdk:17
ENV HOME /root
COPY ./build/libs/docker-test-*.jar /root/docker-test.jar
WORKDIR /root/
CMD [ "java", "-jar", "/root/docker-test.jar" ]