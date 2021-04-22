package travelOffice;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();

        AbroadTrip abroadTrip1 = new AbroadTrip("Florida Trip",LocalDate.of(2020, 11, 12), LocalDate.of(2020, 12, 12), "Florida", 11000, 500 );
        AbroadTrip abroadTrip2 = new AbroadTrip("Warsaw Dream", LocalDate.of(2020, 3, 10), LocalDate.of(2020, 3, 15), "Warszawa", 1000, 300);
        DomesticTrip domesticTrip = new DomesticTrip("Way to Katowice", LocalDate.of(2021, 9, 12), LocalDate.of(2021, 9, 20), "Katowice", 500, 100);

        Customer c1 = new Customer("Anna", "Kowalska","Naleczowska 10", abroadTrip1);
        Customer c2 = new Customer("Katarzyna", "Walesa", "Piotrkowska 3", abroadTrip2);
        Customer c3 = new Customer("Jakub", "Groch", "al. Jerozolimskie 110", domesticTrip);

        travelOffice.addCustomer(c1);
        travelOffice.addCustomer(c2);
        travelOffice.addCustomer(c3);

        travelOffice.addTrip(abroadTrip1);
        travelOffice.addTrip(domesticTrip);
        travelOffice.addTrip(abroadTrip2);

        List<Trip> tripsAfter = travelOffice.findTripsAfter(LocalDate.of(2020, 4, 1));
        System.out.println(tripsAfter.size());

        System.out.println(travelOffice.getCustomersInfo());

    }

}
