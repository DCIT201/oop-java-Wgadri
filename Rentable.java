package vehicle_rental_management;


public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}
