// normally for the FizzBuzz assignment
public String fizzBuzz(int number) {}


// this is what they called overloading when we call two methods
public void fooBar(int someNumber, String someString) {}


// when calling two methods with the same name
public String fizzBuzz(int number) {
// ...
public String fizzBuzz(String number, int numberTwo) {
// ...

// Which code would be invoked when we call the fizzBuzz method? It depends on the argument type and the method signature! 
// Due to Java's type system, if we try to call fizzBuzz with a string and int, it will know that we are trying to invoke the fizzBuzz method with the signature fizzBuzz(String, int). 
// This allows us to handle different cases of method invocation based on our inputs. 
// You may not use this in the beginning of your Java journey, but knowing that Java allows this and identifies methods like this is extremely important.