package travelOffice;

import java.time.LocalDate;

public class Trip {
    private String name;
    private LocalDate start;
    private LocalDate finish;
    private String destination;
    private int price;

    public Trip(String name, LocalDate start, LocalDate finish, String destination, int price) {
        this.name = name;
        this.start = start;
        this.finish = finish;
        this.destination = destination;
        this.price = price;
    }

    @Override
    public String toString() {
        String info = "Trip: Start: " + getStart().toString()
                +" Finish: " + getFinish()
                +" Destination: " + getDestination()
                +" Price: " + getPrice();
        return info;
    }

    public String getName() { return name; }
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

    public void setName(String name) { this.name = name; }

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
