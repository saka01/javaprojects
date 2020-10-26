import java.util.*;

public class Lab4Car {
    private String make;
    private String model;
    private int year;
    private double transmission;
    private int seats;
    private int maxSpeed;
    private int wheels;
    private String type;

    public Lab4Car() {

    }

    public Lab4Car(String make, String model, int year, double transmission, int seats, int maxSpeed, int wheels, String type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.transmission = transmission;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
        this.type = type;

    }

//GETTERS

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getTransmission() {
        return transmission;
    }

    public int getSeats() {
        return seats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    //SETTERS


    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTransmission(double transmission) {
        this.transmission = transmission;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setType(String type) {
        this.type = type;
    }

    //PRINT CARS INFO

    public String print() {
        return "Car{" +
                "make=-" + make + '-' +
                ", model=-" + model + '-' +
                ", year=" + year +
                ", transmission=" + transmission +
                ", seats=" + seats +
                ", maxSpeed=" + maxSpeed +
                ", wheels=" + wheels +
                ", type='" + type + '\'' +
                '}';
    }
}

