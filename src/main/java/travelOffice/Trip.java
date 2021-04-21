package travelOffice;

import java.time.LocalDate;

public class Trip {
    private LocalDate start;
    private LocalDate finish;
    private String destination;
    private int price;

    @Override
    public String toString() {
        String info = "Trip: Start: " + getStart().toString()
                +" Finish: " + getFinish()
                +" Destination: " + getDestination()
                +" Price: " + getPrice();
        return info;
    }

    public Trip(LocalDate start, LocalDate finish, String destination, int price) {
        this.start = start;
        this.finish = finish;
        this.destination = destination;
        this.price = price;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getFinish() {
        return finish;
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return price;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public void setFinish(LocalDate finish) {
        this.finish = finish;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
