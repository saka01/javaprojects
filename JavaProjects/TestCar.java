public class TestCar{

   public static void main(String[] args) {
Car obj=new Car("Honda", "Accord", 2012, 60000);
Car obj2=new Car("BMW","I8",1200000);
System.out.println("Car#1 Info:");

System.out.println(obj);
obj.turnOn();

for(int i=1;i<=5;i++)
{
   obj.accelerate();

}
System.out.println("Car#1 Info:");
System.out.println(obj);
obj.turnOff();
obj.stop();
System.out.println("After Stopping , Car#1 Info:");
System.out.println(obj);

System.out.println("\nCar#2 Info:");
System.out.println(obj2);
obj2.turnOn();

for(int i=1;i<=10;i++)
{
   obj2.accelerate();
   System.out.println("Accelerating.....");
}
System.out.println("Car#2 Info:");
System.out.println(obj2);
for(int i=1;i<=5;i++)
{
   obj2.decelerate();

}
obj2.turnOff();
obj2.stop();
System.out.println("After Stopping , Car#2 Info:");
System.out.println(obj2);



Car obj3 = new Car (100);

obj3.addGas(60);

obj3.drive(120);

double gasLeft = obj3.getGasInTank ( );
System.out.println("Number of Gallons in Car tank :"+gasLeft);

double milesToGo = obj3.getMilesToGo ( );
System.out.println("Number of miles to go with :" + obj3.getGasInTank() + " gallons of gas is : " + milesToGo);
   }

   }
