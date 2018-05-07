# RMI_examples

- Compile it with:

> javac appcalculadora/*.java

 - create a jar file:

> jar cvf classes.jar appcalculadora/*.class

# Run the rmi registry

> rmiregistry

# run the server:

> java -cp . -Djava.rmi.server.codebase=<http:// ou file:// contendo classes.jar> -Djava.security.policy=java.policy      appcalculadora.Servidor

# run the Client:

> java -cp . -Djava.rmi.server.codebase=<http:// ou file:// contendo classes.jar> -Djava.security.policy=java.policy   appcalculadora.Cliente
