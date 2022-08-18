Using Annotation based Dependency Injection

Example 6 - Annotation injection - calling the constructor to inject values

demonstrate how Java annotations can be used to inject dependencies. 
demonstrates a loading of a bean with constructor annotations to wire.The ConstructorAnnotatedColoredShapeHolder has the @Autowired annotation on the constructor, which queries the registry to find a matching bean to set the ColoredShape.
@autowired to constructor
