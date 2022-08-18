Using Java based Dependency Injection

Example 8 - Java-only injection - autowiring with a Component Scan

demonstrate how Java annotations, without any XML, can be used to inject dependencies.
demonstrates a loading of a bean with wiring via component scans

The @ComponentScan annotation on the main class allows scanning of all classes in the base package specified in the parameter
@Component annotation informing Spring to load them up(the class) as beans
@ComponentScan will scan all class in the package with @Component annotation.
@Autowired wires the constructor with an instance of the required class