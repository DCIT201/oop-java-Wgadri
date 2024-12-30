package vehicle_rental_management;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;


    public RentalAgency(){
        this.fleet = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        fleet.add(vehicle);
    }



    public void listAvailableVehicles(){
        for(Vehicle vehicle : fleet){
            if(vehicle.isAvailableForRental()){
                System.out.println(vehicle);
            }
        }
    }

    public void processRental(Customer customer, String vehicleId, int days){
        for(Vehicle vehicle : fleet){
            if(vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()){
                vehicle.rent(customer,days);
                customer.addRentalHistory(vehicle);
                return;

            }
        }
        System.out.println("Vehicle is unavailable.");
    }
}
