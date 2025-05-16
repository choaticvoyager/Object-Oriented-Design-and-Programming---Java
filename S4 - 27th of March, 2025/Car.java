public class Car { // Class to represent a Car with a model    
    private String model; // Private instance variable to store the car's model
    
    public String getModel() { // Getter method to retrieve the car's model
        return model;
    }
    
    public void setModel(String model) { // Setter method to set the car's model
        this.model = model;
    }

    public static void main(String[] args) { // Main method 
        Car c1 = new Car(); // Create a new Car object
        
        c1.setModel("Toyota Corolla"); //Initializing the model of the car using Setter
        
        
        System.out.println(c1.getModel()); // Print the model of the car to the console using Getter

    }
}
