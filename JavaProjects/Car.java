import java.util.Random;

public class Car {
   private String make;
   private String model;
   private int year;
   private double price;
   private int speed;
   private int maxSpeed;
   private boolean isOn;
   private boolean isMoving;

   private int gasEfficiency;
      private int gasLevel;


   public Car(String make, String model, int year, double price) {
       this.make = make;
       this.model = model;
       this.year = year;
       this.price = price;
       this.speed = 0;
       this.maxSpeed = 230;
       this.isOn = false;
       this.isMoving = false;

   }

   public Car(String make, String model, double price) {
       this.make = make;
       this.model = model;
       this.year = 2020;
       this.price = price;
       this.speed = 0;
       this.maxSpeed = 230;
       this.isOn = false;
       this.isMoving = false;

   }

   public Car(int milesPerGallon) {
       this.gasEfficiency = milesPerGallon;
       this.gasLevel = 0;
   }

   public void addGas(int gas) {
       this.gasLevel += gas;
   }

   public void drive(int milesDrive) {

       while (milesDrive > 0 && gasLevel>0) {
           System.out.println("Gas level :"+gasLevel);
           milesDrive -= gasEfficiency;
           if (gasLevel > 0)
               this.gasLevel--;

       }

   }

   public int getGasInTank() {
       return gasLevel;
   }

   public int getMilesToGo() {
       int miles = 0;
       for (int i = 1; i <= gasLevel; i++) {
           miles += gasEfficiency;
       }
       return miles;
   }


   public String getMake() {
       return make;
   }

   public void setMake(String make) {
       this.make = make;
   }

   public String getModel() {
       return model;
   }

   public void setModel(String model) {
       this.model = model;
   }

   public int getYear() {
       return year;
   }

   public void setYear(int year) {
       this.year = year;
   }

   public double getPrice() {
       return price;
   }


   public void setPrice(double price) {
       this.price = price;
   }

   public int getSpeed() {
       return speed;
   }

   public void setSpeed(int speed) {
       this.speed = speed;
   }

   public int getMaxSpeed() {
       return maxSpeed;
   }


   public void setMaxSpeed(int maxSpeed) {
       this.maxSpeed = maxSpeed;
   }

   public boolean isOn() {
       return isOn;
   }


   public boolean isMoving() {
       return isMoving;
   }

   public void turnOn() {
       this.isOn = true;
   }

   public void turnOff() {
       this.isOn = false;
   }

   public void stop() {
       this.isMoving = false;
       ;
   }

   public void accelerate() {
       if (isOn) {
           isMoving = true;
           if (speed < maxSpeed) {
               System.out.println("Accelerating.....");
               speed += 5;
           }
       }
   }

   public void decelerate() {
       if (isOn && isMoving) {
           if (speed > 0) {
               System.out.println("Decelerating.....");
               speed -= 5;
           }
       }
   }



   public String toString() {
       return "Car [make=" + make + ", model=" + model + ", year=" + year
               + ", price=" + price + ", speed=" + speed + ", maxSpeed="
               + maxSpeed + ", isOn=" + isOn + ", isMoving=" + isMoving + "]";
   }

}
