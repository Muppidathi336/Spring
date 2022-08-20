Data persistence with Hibernate and JPA: 
Based on JPA data access specification(that defines how to persist data in Java applications), ORMapping is done by the hibernate tool. In hibernate, we use Session for handling the persistence of data, while in JPA, we use Entity Manager.


Persistence with Hibernate and JPA:

Hibernate provides an EntityManagerFactory to manage database sessions and transactions using the Java Persistence API standard.

Recommended packaging call hierarchy is controller → service → dao


1. Configuration class - The class that configures the HibernateEntityManager to connect to a database
2. Controller layer: auto-wires the service interface, The controller invokes the service methods to persist and retrieve the model's instances. The class is marked with a @Component annotation.
3. Service Layer: auto-wires the DAO interface, Methods in the service delegate to methods in the DAO. The class is marked with a @Service annotation.
4. DAO layer: declares an EntityManager, as a @PersistenceContext to manage transaction.
5. Model: We will have a model, which will define the columns in table by variables.
6. The main function will load the configuration file(which maps the Java class to db tables) and instantiate the bean of the controller, and the functions in controller