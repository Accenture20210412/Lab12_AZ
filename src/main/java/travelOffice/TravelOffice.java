package travelOffice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

public class TravelOffice {
    private List<Customer> customers;
    private List<Trip> trips;

    public TravelOffice() {
        customers = new ArrayList<>();
        trips = new ArrayList<>();
    }

    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }

    public void addCustomer(String name, String surname, String address) {
        customers.add(new Customer(name, surname, address));
    }

    public void addCustomer(String name, String surname, String address, Trip trip) {
        customers.add(new Customer(name, surname, address, trip));
    }

    public int deleteCustomersByName(String name){
        int customersBeforeDeleting = customers.size();

        customers = customers.stream()
                        .filter(c -> !c.getName().contains(name))
                        .collect(Collectors.toList());

        return customersBeforeDeleting - customers.size();
    }

    public int deleteCustomersBySurname(String surname){
        int customersBeforeDeleting = customers.size();

        customers = customers.stream()
                        .filter(c -> !c.getSurname().contains(surname))
                        .collect(Collectors.toList());

        return customersBeforeDeleting - customers.size();
    }

    public void addTripToCustomer(Customer customer, Trip trip){
        customer.setTrip(trip);
    }

    public void addTrip(Trip trip){
        trips.add(trip);
    }

    public Trip findTripByName(String tripName) {
        Optional<Trip> searchedTrip = trips.stream()
                .filter(t -> t.getName() == tripName)
                .findFirst();
        return searchedTrip.isPresent() ? searchedTrip.get() : null;
    }

    public List<Trip> findTripsAfter(LocalDate localDate){
        List<Trip> searchedTrips = trips.stream()
                .filter(t -> t.getStart().isAfter(localDate))
                .collect(Collectors.toList());
        return searchedTrips;
    }

    public List<Trip> findTripsByDestination(String destination) {
        List<Trip> searchedTrips = trips.stream()
                .filter(t -> t.getDestination().contains(destination))
                .collect(Collectors.toList());
        return searchedTrips;
    }

    public String getCustomersInfo() {
        String text="";
        for(Customer customer : customers){
            if(customer!=null) {
                text += "Customer: "
                        + customer.getName()
                        + " " + customer.getSurname()
                        + " " + customer.getAddress();

                if (customer.getTrip() != null) {
                    text += " " + customer.getTrip();
                }
            }
        }
        return text;
    }
}
