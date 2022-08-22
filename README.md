# Spring

## Purpose:
bring flexibility and loose-coupling and dynamic binding of the objects at runtime

## IoC
IoC refers to transferring the control of objects and their dependencies from the main program to a container or framework. 
Object instantiation by the constructor/class method/instance method. So can maintain the object creation separately from the code where they are referenced.

## DI
dependency injection=> dependency b/w the instances is injected by either xml/annotation/plain java. configuration or annotation decides which object to be used.

## Data Persistence in Java Spring
### Persistence with JDBC
Will use the JDBCTemplate helper class for leaving the application code to provide SQL and extract results.
DAO:
will define CRUD operation, and the CRUD operation functions will be using database specific queries(JDBC queries)
also defines a RowMapper, that maps a ResultSet to the model's Java object

### JPA and Hibernate
Based on JPA data access specification(that defines how to persist data in Java applications), ORMapping is done by the hibernate tool. In hibernate, we use Session for handling the persistence of data, while in JPA, we use Entity Manager.
###### JPA mapping annotations:  
@Entity, @Column, @Table etc.)
###### Service layer: 
will deligate to the find/save method in DAO layer. These method will allow to execute sql queries

##### Persistence with hibernate
DAO layer: use session factory to manage database sessions and transactions

##### Persistence with hibernate and jpa
DAO layer: declares an EntityManager, as a @PersistenceContext to manage transaction and to manage database sessions.

##### Persistence with Spring Data jpa:
DAO layer: declares an EntityManager, as a @PersistenceContext to manage transaction. The DAO layer is simply an interface that extends the CrudRepository

