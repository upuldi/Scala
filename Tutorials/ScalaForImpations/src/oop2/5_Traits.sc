//There is no interfaces in Scala, Its called Traits
//As in Java, a class can inherits multiple Traits in Scala, but there
//can only be one super class for a class
// unlike in java in scala we use extends keywords for Traits,
//If there are more than one traits a class extends with keyword is used


class SuperClass {}
class MyClass extends SuperClass with Cloneable with Serializable

// Traits has concrete methods and fields
//Traits can have abstract fields
// implementors of the trait should supply them
// Traits can not have constructor parameter, That is the only difference between
// classes and traits in Scala