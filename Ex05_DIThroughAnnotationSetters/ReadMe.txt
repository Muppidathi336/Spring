Using Annotation based Dependency Injection

Example 5 - Annotation injection - calling the setter to set property values

demonstrate how Java annotations can be used to inject dependencies. 
@Autowired annotation on the setter is used to inject the Dependency.
The XML file defines the beans that are loaded via the ClassPathXmlApplicationContext. This part creates a registry of beans. The SetterAnnotatedColoredShapeHolder has the @Autowired annotation on the setter, which queries the registry to find a matching bean to set the ColoredShape.


@autowired to setter method

