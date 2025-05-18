class Car { // Class to represent a Car with a model    
    private String model; // Private instance variable to store the car's model
    
    public String getModel() { // Getter method to retrieve the car's model
        return model;
    }
    
    public void setModel(String model) { // Setter method to set the car's model
        this.model = model;
    }
}

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

class AllInOneDemo{
	static void print(String s){ //Method for printing
		System.out.println(s); //Display the message
	}
	
	public static void main(String[] args){
		Student s1=new Student("Charle",45); // Creating object s1 with Parameterized constructor
		print("Name of the Student s1 is "+s1.name+" and marks is "+s1.marks); //Displays the name & marks of s1 using print()
		
		Student s2=new Student(); // Creating object s2 with default constructor
		print("Name of the Student s1 is "+s2.name+" and marks is "+s2.marks); //Displays the name & marks of s2 using print()
		
		Student s3=new Student("Don",55); // Creating object s1 with Parameterized constructor
		print("Name of the Student s1 is "+s3.name+" and marks is "+s3.marks); //Displays the name & marks of s3 using print()
		
		Car c1=new Car(); // Creates a new Car object c1
		c1.setModel("Mazda S3"); //Initializes the model of the car using Setter
		print("Model of the Car c1 is "+c1.getModel()); // Prints the model of the car to the console using Getter

		
		Car c2=new Car(); // Creates a new Car object c2
		c1.setModel("Nissan Navara"); //Initializes the model of the car using Setter
		print("Model of the Car c2 is "+c2.getModel()); // Prints the model of the car to the console using Getter
	}
}
