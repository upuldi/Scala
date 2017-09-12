//There is no interfaces in Scala, Its called Traits
//As in Java, a class can inherits multiple Traits in Scala, but there
//can only be one super class for a class
// unlike in java in scala we use extends keywords for Traits,
//If there are more than one traits a class extends 'with' keyword is used


class SuperClass {}
class MyClass extends SuperClass with Cloneable with Serializable

// Traits has concrete methods and fields
//Traits can have abstract fields
// implementors of the trait should supply them
// Traits can not have constructor parameter, That is the only difference between
// classes and traits in Scala

//Traits are used to share interfaces and fields between classes.
// They are similar to Java 8’s interfaces.

/**
raits/mixins can be though of as interfaces with implementation or as a means for multiple inheritance, except the methods aren't really inherited, they are "mixed in", a class implementing a trait will have compiled code for the methods from the trait which will call the compiled trait code.
another important point to understand is linearization:
A key problem with multiple inheritance is diamond inheritance where a class may implement two traits which both provide differnt implementations to the same method (possibly defined in a third trait).
Scala has a linearization process which traverses the superclasses and trait tree and picks the first implementation it meets in the traversale, so there are never two implementations for the same method.

  **/
