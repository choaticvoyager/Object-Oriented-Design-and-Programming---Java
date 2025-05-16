class Person { // Class to represent a Person with a name
    protected String name;// Protected instance variable to store the name

    public String getName() { // Getter method to retrieve the name
        return name;
    }

    public void setName(String newName) { // Setter method to set the name
        name = newName;
    }
}

public class Main { // Main class to run the program
    public static void main(String[] args) { //Main method
        Person p1 = new Person(); // Create a new Person object
        
        p1.setName("John Doe"); // Initializing the name of the person using Setter
        
        System.out.println(p1.getName()); // Print the name of the person to the console using Getter
    }
}
