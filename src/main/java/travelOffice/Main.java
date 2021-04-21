package travelOffice;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();

        Trip trip = new Trip(LocalDate.of(2020, 11, 12), LocalDate.of(2020, 12, 12), "Florida", 11000 );
        AbroadTrip abroadTrip = new AbroadTrip(LocalDate.of(2020, 3, 10), LocalDate.of(2020, 3, 15), "Warszawa", 1000, 300);
        DomesticTrip domesticTrip = new DomesticTrip(LocalDate.of(2021, 9, 12), LocalDate.of(2021, 9, 20), "Katowice", 500, 100);

        Customer c1 = new Customer("Anna", "Kowalska","Naleczowska 10", trip);
        Customer c2 = new Customer("Katarzyna", "Walesa", "Piotrkowska 3", abroadTrip);
        Customer c3 = new Customer("Jakub", "Groch", "al. Jerozolimskie 110", domesticTrip);

        travelOffice.addCustomers(c1);
        travelOffice.addCustomers(c2);
        travelOffice.addCustomers(c3);

        System.out.println(travelOffice.getCustomersInfo());

    }

}
