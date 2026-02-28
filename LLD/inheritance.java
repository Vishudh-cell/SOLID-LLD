class Vehicle {
    String make;
    String model;

    Vehicle() {
        System.out.println("Vehicle constructor called");
    }
}

class Car extends Vehicle {
    Car() {
        super(); // This will call the constructor of the Vehicle class
        make = "Toyota";
        model = "Camry";
        System.out.println("Car constructor called");
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
    }
}

class Bike extends Vehicle {
    Bike() {
        super(); // This will call the constructor of the Vehicle class
        make = "Honda";
        model = "CBR";
        System.out.println("Bike constructor called");
        System.out.println("Bike make: " + make);
        System.out.println("Bike model: " + model);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println();
        Bike bike = new Bike();
        car.make = "Tesla"; // Accessing the make variable from the Vehicle class
        System.out.println("Updated Car make: " + car.make);
        bike.model = "Ninja"; // Accessing the model variable from the Vehicle class
        System.out.println("Updated Bike model: " + bike.model);


        
        Maruti maruti = new Maruti();
        System.out.println("Maruti make: " + maruti.make); // Accessing the make variable from the Vehicle class
        System.out.println("Maruti model: " + maruti.model); // Accessing the model variable from the Vehicle class
        maruti.variant = "Metro"; // Accessing the variant variable from the Maruti class
        maruti.fuelType = "Diesel"; // Accessing the fuelType variable from the Maruti class
        maruti.color = "Blue"; // Accessing the color variable from the Maruti class
        System.out.println("Maruti variant: " + maruti.variant); // Accessing the variant variable from the Maruti class
        System.out.println("Maruti fuel type: " + maruti.fuelType); // Accessing the fuelType variable from the Maruti class
        System.out.println("Maruti color: " + maruti.color); // Accessing the color variable from the Maruti class
    }
}

class Maruti extends Car {
    String variant;
    String fuelType;
    String color;

    Maruti() {
        super(); // This will call the constructor of the Car class
            variant = "Swift";
            fuelType = "Petrol";
            color = "Red";
            System.out.println("Maruti constructor called");
            System.out.println("Maruti variant: " + variant);
            System.out.println("Maruti fuel type: " + fuelType);
            System.out.println("Maruti color: " + color);
        System.out.println("Maruti constructor called");
    }

}