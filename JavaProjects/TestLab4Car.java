import java.util.*;

public class TestLab4Car {

    public static void main(String[] args) {
        Lab4Car car1 = new Lab4Car("Honda", "Civic", 2021, 22.45, 2, 300, 4, "SEDAN");

        Lab4Car car2 = new Lab4Car();

        car2.setMake("Bugatti");
        car2.setModel("noire");
        car2.setYear(2018);
        car2.setTransmission(40.25);
        car2.setSeats(4);
        car2.setMaxSpeed(500);
        car2.setWheels(4);
        car2.setType("Coupe");

        Dealership dealer1 = new Dealership();

        dealer1.addNameofcompany("Moshoods Dealership company");
        dealer1.addLocation("Windsor");

        ArrayList<String> employees = new ArrayList<String>();
        employees.add("Segun");
        employees.add("Roddy");

        ArrayList<String> employees2 = new ArrayList<String>();
        employees2.add("Ryan");
        employees2.add("Dawn");

        ArrayList<String> managers = new ArrayList<String>();
        managers.add("Saka");
        managers.add("Mo");

        ArrayList<String> managers2 = new ArrayList<String>();
        managers2.add("Ola");
        managers2.add("Ali");

        dealer1.addManagers(managers);
        dealer1.addEmployees(employees);
        dealer1.addCars(car1);

        Dealership dealer2 = new Dealership("Rawias Dealership Company", "Saudi");

        dealer2.addEmployees(employees2);
        dealer2.addManagers(managers2);
        dealer2.addCars(car2);

        System.out.println(dealer1.printDealership());
        System.out.println(dealer2.printDealership());
        System.out.println(dealer2.getCars());


//        System.out.println(car1.print());



    }
}
