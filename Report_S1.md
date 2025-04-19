# Session 01

**Title**: Introduction to Java Programming  
**Number of Practical**: 03  
**Date**: 14.03.2025  
**Time**: 10:30 AM - 12:30 PM  

## 1. Objective
To understand the basic syntax and structure of a Java program.

## 2. Concepts
- Compiling and running a Java file.
- Creating classes and objects.
- Differentiating between `print` and `println`.
- Using command-line arguments.
- Initialization and declaration of variables.

## 3. Algorithms

### MyFirstJavaProgram
1. **Start**: Begin the program.
2. **Define Class**: Create a class named `MyFirstClass`.
3. **Define Main Method**: Inside the class, define the main method which serves as the entry point of the program.
   - **Input**: Accepts an array of strings as arguments (`String[] args`).
4. **Print Messages**:
   - Use `System.out.print` to display the message "Hi ".
   - Use `System.out.print` to display the message "This is IT1234 practical session 1 ".
   - Use `System.out.println` to display the message "This prints next in a new line".
   - Use `System.out.print` to display the message "This is in a new line".
5. **End**: The program execution completes.

### Program_2
1. **Start**: Begin the program.
2. **Define Class**: Create a class named `MySecondClass`.
3. **Define Main Method**: Inside the class, define the main method which serves as the entry point of the program.
   - **Input**: Accepts an array of strings as arguments (`String[] arr`).
4. **Print First Argument**:
   - Use `System.out.println` to display the message "The first argument is " followed by the first element of the array, `arr[0]`.
5. **Print Second Argument**:
   - Use `System.out.println` to display the message "The second argument is " followed by the second element of the array, `arr[1]`.
6. **Print Additional Arguments**:
   - Use `System.out.println` to display the third element `arr[2]`, the fifth element `arr[4]`, and the fourth element `arr[3]` separated by spaces.
7. **End**: The program execution completes.

### Program_3
1. **Start**: Begin the program.
2. **Define Class One**:
   - Declare an integer variable `a` and initialize it to 10.
   - Declare an integer variable `b` (uninitialized).
   - Define a method `PrintDetails()`:
     - Print the value of `a`.
     - Print the value of `b`.
3. **Define Class Two**:
   - Declare two integer variables `a` and `c` (uninitialized).
   - Define a method `PrintDetails()`:
     - Print the value of `a`.
     - Print the value of `c`.
4. **Define Class App**:
   - Define the main method which serves as the entry point of the program.
   - Create an instance of `One` named `o1`.
   - Create an instance of `Two` named `t1`.
   - Call `PrintDetails()` method on `o1` to print the initial values of `a` and `b`.
   - Set the value of `b` in `o1` to 100.
   - Call `PrintDetails()` method on `o1` again to print the updated values.
   - Call `PrintDetails()` method on `t1` to print the initial values of `a` and `c`.
   - Set the value of `a` in `t1` to 20.
   - Set the value of `c` in `t1` to 30.
   - Call `PrintDetails()` method on `t1` again to print the updated values.
5. **End**: The program execution completes.

## 4. Source Code
- [MyFirstJavaProgram](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/tree/main/S1%20-%2014th%20of%20March%2C%202025/MyFirstJavaProgram)
- [Program_2](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/tree/main/S1%20-%2014th%20of%20March%2C%202025/Program_2)
- [Program_3](https://github.com/choaticvoyager/Object-Oriented-Design-and-Programming---Java/tree/main/S1%20-%2014th%20of%20March%2C%202025/Program_3)

## 5. Sample Input & Expected Output

### MyFirstJavaProgram
**Input**:
```bash
javac MyFirstJavaProgram.java
java MyFirstClass
```
**Output**:
```
Hi This is IT1234 practical session 1 This prints next in a new line
This is in a new line
```

### Program_2
**Input**:
```bash
javac Program_2.java
java MySecondClass Argument1 Argument2 How are you
```
**Output**:
```
The first argument is Argument1
The second argument is Argument2
How you are
This is in a new line
```

### Program_3
**Input**:
```bash
javac Program_3.java
java App
```
**Output**:
```
From class One a = 10
From class One b = 0
From class One a = 10
From class One b = 100
From class Two a = 0
From class Two c = 0
From class Two a = 20
From class Two c = 30
```

## 6. Observations

### MyFirstJavaProgram
- **Error**: `package system does not exist` in `System.out.print("Hi");`
  - **Solution**: Changed the word 'system' to 'System'.

- **Error**: `';' expected` in `System.out.print("This is in a new line")`
  - **Solution**: Inserted `';'` at the end of the line.

### Program_2
- **Error**: `Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0` at `MyFirstClass.main(Args.java:9)`
  - **Solution**: Include array elements/arguments next to the commands in the console.
- Until the required array elements or arguments are provided, an error message will appear.
- Array indexing matters, as the output will be displayed in the specified order.

### Program_3
- The output shows the values of the instance variables before and after initialization.

## 7. Conclusion

### MyFirstJavaProgram
- Demonstrated how to print messages to the console.
- Highlighted the difference between using `System.out.print()` and `System.out.println()`.

### Program_2
- Demonstrated string concatenation to combine messages with the values of the command-line arguments.
- Illustrated how to access specific elements of an array using their indices.

### Program_3
- Introduced the concept of creating classes with instance variables and methods.
- Demonstrated how to instantiate objects of classes (One and Two) and call methods on these objects.
- Showed the difference between variable declaration and initialization.
