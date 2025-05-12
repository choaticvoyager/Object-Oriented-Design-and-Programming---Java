# Session 3  

**Title:** Inheritance  
**No. of Practicals:** 02  
**Date:** 21.03.2025  
**Time:** 10:30 AM - 12:30 PM  

## 1. Objective
To understand the concept of inheritance using packages.

## 2. Concepts
- Using access modifiers to ensure the access of the class and its elements outside the package.
- Preventing naming conflicts by using similar names in different packages.
- Creating a child class using the `extends` keyword to inherit properties from a parent class.
- Defining and using methods with parameters.

## 3. Algorithms

### Test (Package a)
1. **Start:** Begin the program.
2. **Define the package:** Specify the package name for the class `Test` as `a`.
3. **Define Class:** Create a public class named `Test`.
4. **Define the method `print`:** Inside the class, define a method named `print` with no return type (`void`).
   - **Print Message:** Use `System.out.println` to display the message inside `print()`.
5. **Define the method `display`:** Inside the class, define a method named `display` with no return type (`void`).
   - **Print Message:** Use `System.out.println` to display the message inside `display()`.
6. **End:** The program execution completes.

### Test (Package b)
1. **Start:** Begin the program.
2. **Define the package:** Specify the package name for the class `Test` as `b`.
3. **Define Class:** Create a public class named `Test`.
4. **Define the method `print`:** Inside the class, define a method named `print` with no return type (`void`).
   - **Print Message:** Use `System.out.println` to display the message inside `print()`.
5. **End:** The program execution completes.

### App (Packages a&b)
1. **Start:** Begin the program.
2. **Import Packages:** Import all classes from the packages `a` and `b`.
3. **Define Class:** Declare a public class named `App`.
4. **Define Main Method:** Inside the class, define the main method which serves as the entry point of the program.
5. **Create instance for each class:**
   - Create an instance of the `Test` class from the package `a`.
   - Create an instance of the `Test` class from the package `b`.
6. **Print Messages:**
   - Call the `print` method on the instance of the `Test` class from the `a` package to print its message.
   - Call the `display` method on the instance of the `Test` class from the `a` package to print its message.
   - Call the `print` method on the instance of the `Test` class from the `b` package to print its message.
7. **End:** The program execution completes.

### Human (Package Human)
1. **Start:** Begin the program.
2. **Define the package:** Specify the package name for the class `Human` as `human`.
3. **Define Class:** Create a public class named `Human`.
4. **Define the method `talk`:** Inside the `Human` class, define a public method named `talk` that takes a parameter `word` of type `String`.
   - **Print Message:** Use `System.out.println` to display the message inside `talk()` followed by the value of the `word` parameter.
5. **End:** The program execution completes.

### Person (Package Human)
1. **Start:** Begin the program.
2. **Define the package:** Specify the package name for the class `Person` as `human`.
3. **Define Class:** Create a public class named `Person` that inherits from the `Human` class using the `extends` keyword.	
4. **Declare a String variable:** Declare a `String` variable `name` and initialize it to "Alijendro".
5. **End:** The program execution completes.

### App (Invoice App)
1. **Start:** Begin the program.
2. **Import Packages:** Import all classes from the package `human`.
3. **Define Class:** Declare a public class named `App`.
4. **Define Main Method:** Inside the class, define the main method which serves as the entry point of the program.
5. **Print Message:** Use `System.out.println` to display the welcoming message.
6. **Create an instance of the `Person` class** from the package `human`.
7. **Call the inherited `talk(String word)` method** using the `p1` object, passing "Hi from Angelo" as an argument.
8. **Print the name property** of the `p1` object.
9. **End:** The program execution completes.

## 4. Source Code
- [Test.java (Package a)](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/tree/main/S3%20-%2021th%20of%20March%2C%202025/a/Test.java)
- [Test.java (Package b)](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/tree/main/S3%20-%2021th%20of%20March%2C%202025/blTest.java)
- [App.java (Packages a&b)](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/blob/main/S3%20-%2021th%20of%20March%2C%202025/App.java)
- [Human.java (Package Human)](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/blob/main/S3%20-%2021th%20of%20March%2C%202025/Invoice%20App/human/Human.java)  
- [Person.java (Package Human)](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/blob/main/S3%20-%2021th%20of%20March%2C%202025/Invoice%20App/human/Person.java) 
- [App.java (Invoice App)](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/blob/main/S3%20-%2021th%20of%20March%2C%202025/Invoice%20App/App.java) 

## 5. Sample Input & Expected Output

### App.java (Packages a&b)
**Input:**
```bash
javac App.java
java App
```
**Output:**
```
Hi from class Test in package a
Display: Hi from class Test in package a
Hi from class Test in package b
```

### App (Invoice App)
**Input:**
```bash
javac App.java
java App
```
**Output:**
```
Welcome to Invoice App
Human says: Hi from Angelo
Name: Alijendro
```

## 6. Observations

### App.java (Packages a&b)
- **Error:** cannot find symbol  
  **Solution:** Used the object to call the inherited method.

### App (Invoice App)
- **Error:** ';' expected in `System.out.println("Name: "+p1.name)`  
  **Solution:** Inserted ';' at the end of the line.

- **Error:** name is not public in Person; cannot be accessed from outside package in `System.out.println("Name: "+p1.name)`  
  **Solution:** Added the public access modifier to the name variable to make it accessible outside the package.

## 7. Conclusion

- Adding package name with the class name prevents conflicts when instantiating similar classes from different packages.  
- Import statements allow access to classes from different packages.
- Access modifiers control visibility of classes and their members across packages.  
- Inheritance allows a subclass to acquire non-private properties and behaviors from its superclass.  
- Using the keyword `extends`, a subclass is created.  
- In Java, a `String` can hold not only a single word but also an entire sentence.
