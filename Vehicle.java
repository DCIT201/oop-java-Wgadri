package vehicle_rental_management;
import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle implements Rentable{
    private final String vehicleId;
    private final String model;
    private double baseRentalRate;
    private boolean isAvailable;
    private List<Integer> ratings;


    public Vehicle(String vehicleId, String model){
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
        this.ratings = new ArrayList<>();
    }



    public String getVehicleId(){
        return vehicleId;
    }

    public String getModel(){
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract double calculateRentalCost(int days);

    public abstract boolean isAvailableForRental();


   // public boolean isAvialable() {
     //   return isAvialable();
  //  }

    public void returnVehicle(){}



    public void rateVehicle(int rating){
        if(rating < 1 || rating > 10 ){
            System.out.println("Rating must be between 1 and 10");
        }
        ratings.add(rating);
    }

    public double getAverageRating(){
        if(ratings.isEmpty()){
            return 0.0;
        }
        int sum = 0;
        for(int rating : ratings){
            sum += rating;
        }
        return sum/(double) ratings.size();
    };


    public boolean isQualifiedForRental(){
        if(getAverageRating() != 0.0 && getAverageRating() < 5.0){
            System.out.println("Vehicle rating is below 5.0.");
        }
        return true;
    }


    public String toString(){
        return "Vehicle ID: " + vehicleId + ", Model: " + model ;
    }



}


