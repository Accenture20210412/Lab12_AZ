package travelOffice;

import java.time.LocalDate;

public class DomesticTrip extends Trip{
    private int discount;

    public int getFinalPrice() {
        return getPrice() - getDiscount();
    }

    public DomesticTrip(String name, LocalDate start, LocalDate finish, String destination, int price, int discount) {
        super(name, start, finish, destination, price);
        this.discount = discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
