class Student { // Class to represent a Student
    // Instance variables
    String name = "Adam";  // Default name
    int marks = 87;        // Default marks
    
    Student() {     // Default constructor
        name = "NoName"; // Initialize name to "NoName" when no parameters are passed
    }
    
    Student(String n, int m) {  // Parameterized constructor to initialize with specific values
        name = n;     // Initialize name with provided value
        marks = m;    // Initialize marks with provided value
    }
}

class StudentDemo { // StudentDemo class to test the Student class
    public static void main(String[] args) { //Main method
        System.out.println("Hi from StudentDemo class");
        
        System.out.println("Creating an object of Student class");
        Student s1 = new Student(); // Creating object with default constructor
        System.out.println("Created an object of Student class");
        
        System.out.println("Name value of the object is " + s1.name); // Print the values of the field name for s1 
        System.out.println("Marks value of the object is " + s1.marks); // Print the values of the field marks for s1
        
        Student s2 = new Student("Nice Name", 99);  // Creating object with custom name and marks using parameterized constructor
        
        System.out.println("Name value of the object is " + s2.name); // Print the values of the field name for s2
        System.out.println("Marks value of the object is " + s2.marks); // Print the values of the field main for st 
        
        s1.name = "Zara";  // Modify the values of the field name of s1 to "Zara"
        s1.marks = 56;     // Modify the values of the field marks of s1 to 56
        
        System.out.println("Name value of the object is " + s1.name); // Print the updated value of the field name for s1
        System.out.println("Marks value of the object is " + s1.marks); // Print the updated value of the field marks for s1

    }
}
