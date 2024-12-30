package vehicle_rental_management;


public class Truck extends Vehicle implements Rentable {
    private double loadCapacity;
    private double baseRentalRate;

public Truck(String VehicleId, String model){
        super(VehicleId, model);
        this.loadCapacity = loadCapacity;
        this.baseRentalRate = 30.0;
    }
    @Override
    public double calculateRentalCost(int days) {
        return 30.0 * days + loadCapacity > 1200? 50 * days:0;
    }

    @Override
    public boolean isAvailableForRental() {
        return getIsAvailable();
    }

    public void rent(Customer customer, int days){
        if(isAvailableForRental())
            setAvailable(false);
        System.out.println("Truck rented by " + customer.getName() + "for " + days +"days.");
    }

    public void returnVehicle(){
        setAvailable(true);
        System.out.println("Truck returned");
    }
}
