package vehicle_rental_management;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
    private final String name;
    private final String contact;
    private final List<Vehicle>rentalHistory;
    private List<Integer>ratings;

    public Customer(String name, String contact){
        this.name = name;
        this.contact = contact;
        this.rentalHistory = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public <Vehicle> void addRentalHistory(Vehicle vehicle){
        rentalHistory.add((vehicle_rental_management.Vehicle) vehicle);
    }

    public List<Vehicle>getRentalHistory(){
        return Collections.unmodifiableList(rentalHistory);
    }

    public void rateCustomer(int rating){
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
            System.out.println("Customer rating is below 5.0.");
        }
        return true;
    };




    public String toString(){
        double average_rating = getAverageRating();
        return ("Customer_name: " + name+ "Contact "+ contact);

    }



}

