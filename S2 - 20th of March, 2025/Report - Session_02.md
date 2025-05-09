# Session 02

**Title:** Java Packages  
**Date:** 20.03.2025  
**Time:** 01:30pm - 03:30pm  

## 1. Objective
To demonstrate how packages help manage different groups of related classes and the use of import statements.

## 2. Concepts
- Grouping related classes in a single package.
- Using access modifiers to ensure the access of the class and its elements outside the package.
- Enabling the access of different packages through import statements.
- Preventing naming conflicts by using similar names in different packages.

## 3. Algorithms

### For Programs Inside Packages
1. **Start:** Begin the program.
2. **Define the Package:** Specify the package name for the class.
3. **Define Class:** Create a public class with an appropriate name.
4. **Define the Method `display`:** Inside the class, define a method named `display` with no return type (void).
5. **Print Message:** Use `System.out.println` to display the message.
6. **End:** The program execution completes.

### App.java
1. **Start:** Begin the program.
2. **Import Packages:** Import all classes from the packages `IT`, `IT.Hons`, `AMC`.
3. **Define Class:** Declare a public class named `App`.
4. **Define Main Method:** Inside the class, define the main method which serves as the entry point of the program.
5. **Create Instance for Each Class:**
   - Create an instance of the `FirstYear` class from the `IT` package.
   - Create an instance of the `FourthYear` class from the `IT.Hons` package.
   - Create an instance of the `FirstYear` class from the `AMC` package.
   - Create an instance of the `SecondYear` class from the `AMC` package.
6. **Print Messages:** 
   - Call the `display` method on instance of the `FirstYear` class from the `IT` package to print its message.
   - Call the `display` method on instance of the `FourthYear` class from the `IT.Hons` package to print its message.
   - Call the `display` method on instance of the `FirstYear` class from the `AMC` package to print its message.
   - Call the `display` method on instance of the `SecondYear` class from the `AMC` package to print its message.
7. **End:** The program execution completes.

## 4. Source Code
- [Package IT](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/tree/main/S2%20-%2020th%20of%20March%2C%202025/IT)
- [Package AMC](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/tree/main/S2%20-%2020th%20of%20March%2C%202025/AMC)
- [App.java](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/blob/main/S2%20-%2020th%20of%20March%2C%202025/App.java)

## 5. Sample Input & Expected Output
### Input
```bash
javac App.java
java App
```
### Output
```
Hi from class FirstYear in package IT
Hi from class FourthYear in package IT.Hons
Hi from class FirstYear in package AMC
Hi from class SecondYear in package AMC
```

## 6. Observations
- **Error:** package does not exist  
  **Solution:** Changed the package name to match the folder name.

- **Error:** cannot find symbol  
  **Solution:** Imported all the classes inside each package.

- **Error:** display() is not public in SecondYear; cannot be accessed from outside package  
  **Solution:** Added public before display() in SecondYear.

- Instead of importing each class individually, a wildcard `*` can be used with the package name.

- Similar names can be used for Java files in different packages.

- To avoid naming conflicts, the package name is added before the class and constructor when creating an instance.

## 7. Conclusion
- Packages group related classes.
- Access modifiers control visibility of classes and their members across packages.
- Import statements allow access to classes from other packages.
- Packages allow same class names in different packages.
- Adding class names with the package name prevents conflicts when instantiating classes from different packages.
