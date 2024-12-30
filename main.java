package vehicle_rental_management;
import java.util.Collections;

public class main {

    public static void main(String[] args){
        try {
            RentalAgency agency = new RentalAgency();
            Customer customer = new Customer("John Anderson","0534231345");
            Vehicle car = new Car("S001", "Toyota Camry");
            Vehicle Motorcycle = new Motorcycle("K001","Yamaha");
            Vehicle Truck = new Truck("G001","Toyota ");

            agency.addVehicle(car);
            agency.addVehicle(Motorcycle);
            agency.addVehicle(Truck);

            car.rent(customer, 4);

            car.returnVehicle();
            agency.listAvailableVehicles();


        } catch (Exception e) {
            System.out.println("Error.");;
        }
    }
}
