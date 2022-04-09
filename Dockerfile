FROM maven:3-openjdk-17

WORKDIR /usr/src/mymaven

COPY bin .

ENTRYPOINT ["mvn"]

CMD ["clean", "install", "compile", "package", "run"]

# CMD ["java -jar target\DropWizardExample-0.0.1-SNAPSHOT.jar server"]
