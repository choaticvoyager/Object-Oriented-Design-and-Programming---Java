# Session 4

**Date:** 27.03.2025  
**Time:** 01:30pm - 03:30pm  
**No. of Practicals:** 03  

---

## Title:
Constructors, Encapsulation, Getters & Setters

---

## Objective:
To understand how to define and use constructors, and to implement encapsulation using access modifiers and getter/setter methods.

---

## Concepts:
- Default constructor overriding initial values.
- Parameterized constructor initializing fields with custom values.
- Field modification after object creation.
- Class interaction using object references.
- Protected field access.
- Use of `this` keyword to distinguish between class field and method parameter.
- Implementing encapsulation using getters and setters.

---

## Algorithms:

### Student.java
- **Start:** Begin the program.
- **Define the Student Class:** Declare a class named `Student`.
- **Define two instance variables:** 
  - `String name` initialized to "Adam"
  - `int marks` initialized to 87.
- **Create a default constructor:** Set `name` to "NoName".
- **Create a parameterized constructor:** Accept parameters `String n` and `int m` and set `name` to `n` and `marks` to `m`.
- **Define the StudentDemo Class:** Declare a class named `StudentDemo`.
- **Define the main method:**
  - Print "Hi from StudentDemo class".
  - Print "Creating an object of Student class".
  - Create an object `s1` of the `Student` class using the default constructor.
  - Print "Created an object of Student class".
  - Print the name and marks of the `s1` object.
  - Create another object `s2` of the `Student` class using the parameterized constructor with "Nice Name" and 99 as arguments.
  - Print the name and marks of the `s2` object.
  - Modify the name and marks of the `s1` object to "Zara" and 56, respectively.
  - Print the updated name and marks of the `s1` object.
- **End:** The program execution completes.

---

### Main.java
- **Start:** Begin the program.
- **Define the Person Class:** Declare a class named `Person`.
- **Define a protected instance variable:** `String name`.
- **Create a method `getName()`:** Return the value of `name`.
- **Create a method `setName(String newName)`:** Set the value of `name` to `newName`.
- **Define the Main Class:** Declare a class named `Main`.
- **Define the main method:**
  - Create an object `p1` of the `Person` class.
  - Call the `setName` method on `p1` with the argument "John Doe" to set the name.
  - Call the `getName` method on `p1` and print the returned name.
- **End:** The program execution completes.

---

### Car.java
- **Start:** Begin the program.
- **Define the Car Class:** Create a class named `Car`.
- **Declare a Private Attribute:** Inside the `Car` class, declare a private string attribute named `model`.
- **Create Getter Method:** Define a public method `getModel()` that returns the value of the `model` attribute.
- **Create Setter Method:** Define a public method `setModel(String model)` that sets the value of the `model` attribute to the provided string.
- **Define the main method:**
  - Create an object `c1` of the `Car` class.
  - Call the `setModel` method on `c1` to set the model to "Toyota Corolla".
  - Call the `getModel` method on `c1` and print the returned value to the console.	
- **End:** The program execution completes.

---

## Source Code:
- [Student.java](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/blob/main/S4%20-%2027th%20of%20March%2C%202025/Student.java)
- [Main.java](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/blob/main/S4%20-%2027th%20of%20March%2C%202025/Main.java)
- [Car.java](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/blob/main/S4%20-%2027th%20of%20March%2C%202025/Car.java)

---

## Sample Input & Expected Output:

### Student.java
```
Input1:  javac Student.java
Input2:  java StudentDemo

Output: 
    Hi from StudentDemo class
    Creating an object of Student class
    Created an object of Student class
    Name value of the object is NoName
    Marks value of the object is 87
    Name value of the object is Nice Name
    Marks value of the object is 99
    Name value of the object is Zara
    Marks value of the object is 56
```

### Main.java
```
Input1:  javac Main.java
Input2:  java Main

Output: 
    John Doe
```

### Car.java
```
Input1:  javac Car.java
Input2:  java Car

Output: 
    Toyota Corolla
```

---

## Observations

### Student.java
- **Error:** Main method not found in class TestClass, please define the main method as: `public static void main(String[] args)` or a JavaFX application class must extend `javafx.application.Application`.  
  **Solution:** Ran the program using the correct class name.

- **Error:** not a statement - `s1.name;` & `s1.marks;`.  
  **Solution:** Printed the values using `System.out.println` and initialized appropriate values.

- **Error:** unclosed character literal in `s1.name='Zara';`.  
  **Solution:** Used double quotes for "Zara" instead of single quotes.

The default constructor overrides the initial value of `name`, but does not modify the `marks` field.

---

### Main.java
- **Error:** class, interface, or enum expected in `public void setName(String newName){`.  
  **Solution:** Inserted `}` at the end of class `Person`.

- **Error:** class `main` is public, should be declared in a file named `main.java`.  
  **Solution:** Renamed the file name as `Main.java`.

- **Error:** name has private access in `Person` - `System.out.println(p1.name);`.  
  **Solution:** Used getter to access variable `name`.

- **Error:** name has private access in `Person` - `p1.name="John";`.  
  **Solution:** Used setter to initialize a new variable `name`.

The name field is marked as protected, offering restricted access within the package and to subclasses.

---

### Car.java
- The model field is marked as private, offering no access outside the class.

Demonstrates proper use of the `this` keyword to resolve variable name conflicts.

---

## Conclusion
- The default constructor initializes fields to default values while parameterized constructors allow custom initialization.
- The access modifier `protected` limits access to subclasses and the same package, while the access modifier `private` ensures fields can't be accessed directly outside the class.
- The `this` keyword helps differentiate between instance variables and method parameters.
- Getter and setter methods help protect the internal state of an object by providing controlled access to its private fields.
