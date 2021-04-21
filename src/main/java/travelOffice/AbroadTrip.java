package travelOffice;

import java.time.LocalDate;

public class AbroadTrip extends Trip{
    private int insurance;

    public int getFinalPrice() {
        return getInsurance() + getPrice();
    }

    public AbroadTrip(LocalDate start, LocalDate finish, String destination, int price, int insurance) {
        super(start, finish, destination, price);
        this.insurance = insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public int getInsurance() {
        return insurance;
    }
}
