Persistence with JDBC:

Purpose: 

Persist data using JDBC

How to do:
1. We will have a model, which will define the columns in table by variables. 
2. We will be having interface for Data Access Object(abstract CRUD). We will be having a class That implements that interface, All CRUD methods are implemented. The DAO implementation also defines a RowMapper, as a ColoredShapeMapper, that maps a ResultSet to a ColoredShape Java object. Here the CRUD operation functions will be using database specific queries(JDBC queries)
3. configuration file(which maps the Java class to db tables using JDBC)
4. The main function will load the configuration file(which maps the Java class to db tables) and instantiate the bean of DAO interface, and call the CRUD function