FROM openjdk:14-alpine
COPY build/libs/helloworld-micronaut-*-all.jar helloworld-micronaut.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "helloworld-micronaut.jar"]