package vehicle_rental_management;



public class Motorcycle extends Vehicle implements Rentable {
    private boolean hashelmetIncluded;
    private double baseRentalRate;


    public Motorcycle(String vehicleid, String model) {
        super(vehicleid, model);
        baseRentalRate = 15.0;
        this.hashelmetIncluded = hashelmetIncluded;
    }



    @Override
    public double calculateRentalCost(int days) {
        return baseRentalRate * days + (hashelmetIncluded? 5 * days:0);
    }

    @Override
    public boolean isAvailableForRental() {
        return getIsAvailable();
    }

    public void rent(Customer customer, int days){
        if(isAvailableForRental())
            setAvailable(false);
        System.out.println("Motorcycle rented by " + customer.getName() + "for " + days +" days.");


    }

    public void returnVehicle(){
        setAvailable(true);
        System.out.println("Motorcycle is returned");
    }
}
