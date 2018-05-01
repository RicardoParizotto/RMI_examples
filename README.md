# RMI_examples

# To run the example run the rmy registry

> rmiregistry

# run the server:

> java -cp . -Djava.rmi.server.codebase=<http:// ou file:// contendo classes.jar> -Djava.security.policy=java.policy      appcalculadora.Servidor

# run the Client:

> java -cp . -Djava.rmi.server.codebase=<http:// ou file:// contendo classes.jar> -Djava.security.policy=java.policy   appcalculadora.Cliente
