import java.util.Scanner;

public class Car_project {

    public static void main(String[] args) {

        
        Scanner carModel = new Scanner(System.in);

        // Store's customer input for the rest of the code 
        Car customerCar = new Car();

        
        System.out.println("Welcome customer! Would you like to search for a specific model of vehicle today? (Yes/No): ");
        
        // Read's customer's response
        String response = carModel.nextLine();
        
        // equalsIgnoreCase is to process the input whether it's upper or lowercase 
        if(response.equalsIgnoreCase("Yes")) {
            System.out.println("Please enter the model of the car you prefer! ");
            String model = carModel.nextLine(); 
            customerCar.setCarModel(model);  // Set the car model using setter method
            System.out.println("You prefer a " + customerCar.getCarModel() + " model.");
        } else {
            System.out.println("That's okay, there's a ton of other models to search for :)");
        }

        //Nearby searching for car models 
        System.out.println("\nWould you like to search for cars nearby your area? (Yes/No): ");
        String nearbyResponse = carModel.nextLine();
        

        //Location detection
        if(nearbyResponse.equalsIgnoreCase("Yes")) {
            System.out.println("Great! Please enter your current or nearby city. ");
            String location = carModel.nextLine();  
            customerCar.setLocation(location);  

            // printing finding nearby cars
            System.out.println("Searching for cars near " + customerCar.getLocation() + ".....");
            
            // Display nearby cars using the location 
            displayNearbyCars(customerCar.getLocation());
        } else {
            System.out.println(" That's alright! You can still browse cars from other locations and listings.");
        }

        carModel.close();
    }

    // displays nearby cars
    public static void displayNearbyCars(String location) {
      
        System.out.println("\nHere's some cars available near your provided area" + location + ":");
        
       // Car listing w/ prices 
        System.out.println("1. 2021 Honda Civic - $22,000");
        System.out.println("2. 2019 Toyota Corolla - $18,500");
        System.out.println("3. 2020 Ford Mustang - $27,000");
        System.out.println("4. 2021 Tesla Model 3 - $40,000");
    }
}


class Car {

    
    private String carModel;
    private String location;

    // Getter for carModel
    public String getCarModel() {
        return carModel;
    }

    // Setter for carModel
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }
}



    }
}
