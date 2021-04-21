package travelOffice;

public class Customer {
    private String name;
    private String surname;
    private String address;
    private Trip trip;

    public Customer(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Customer(String name, String surname, String address, Trip trip) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.trip = trip;
    }

    @Override
    public String toString() {
        if(trip != null) {
            return "Customer: Name: " + getName()
                    + " Surname: " + getSurname()
                    + " Address: " + getAddress()
                    + " Trip: " + getTrip();
        }
        else {
            return "Customer: Name: " + getName()
                    + " Surname: " + getSurname()
                    + " Address: " + getAddress();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public Trip getTrip() {
        return trip;
    }
}
