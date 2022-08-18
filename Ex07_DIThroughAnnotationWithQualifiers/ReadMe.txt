Using Annotation based Dependency Injection

Example 7 - Annotation injection - calling the constructor to inject values, with a Qualifier

demonstrate how Java annotations can be used to inject dependencies. 
demonstrates a loading of a bean with constructor annotations to wire with qualifier. In the xml, There are two ColoredShape beans, which will lead to a confusion about which bean to load. But in the java code which inject dependency, has the The Constructor parameter also has an annotation of a Qualifier which specifies that the bean to load uses the thePinkPolygon bean, and not the aColoredShape


The XML configuration simply instantiates a bean to be made available to the holder and includes a qualifier.

@autowired to constructor with qualifier