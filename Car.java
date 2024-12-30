package vehicle_rental_management;


import static jdk.jfr.internal.JVM.isAvailable;

class Car extends Vehicle implements Rentable {

     private final boolean hasAirCondition;
     private double baseRentalRate;



     public Car(String vehicleid, String model) {
         super(vehicleid, model);
        this.baseRentalRate = 20.0;
         this.hasAirCondition = true;
     }


     @Override
     public double calculateRentalCost(int days) {
         return baseRentalRate * days + (hasAirCondition ? 15 * days:0);
     }

  

     @Override
     public boolean isAvailableForRental() {
         return getIsAvailable();
     }

     public void rent(Customer customer, int days){
         if(isAvailableForRental()){
             setAvailable(false);
             System.out.println("Car is rented by " + customer.getName() + "for " + days + "days");

         }
         else {
             System.out.println("Car is not available for rental.");
         }
     }


     public void returnVehicle(){
         setAvailable(true);
         System.out.println("Car returned.");

     }



 }
