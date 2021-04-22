package travelOffice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class TravelOfficeTest {

    private TravelOffice travelOffice = new TravelOffice();

    @Test
    public void shouldAddCustomer() {
        //given
        Customer customer = new Customer("Kuba", "Nowak", "Katowice");
        //when
        travelOffice.addCustomer(customer);
        //then
        Assertions.assertTrue(travelOffice.getCustomersInfo().contains("Kuba"));
    }

    @Test
    public void shouldDeleteCustomersByName() {
        //given
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer("Kuba", "Nowak", "Katowice");
        customers.add(customer);
        //when
        travelOffice.deleteCustomersByName("Kuba");
        //then
        Assertions.assertFalse(customers.contains(customer));
    }

    @Test
    public void shouldAddTripToCustomer() {
        //given
        Customer customer = new Customer("Kuba", "Nowak", "Katowice");
        Trip trip = new Trip("Baltyk", LocalDate.parse("2021-07-01"), LocalDate.parse("2021-07-15"), "Gdansk", 5000);
        //when
        travelOffice.addTripToCustomer(customer, trip);
        //then
        Assertions.assertTrue(customer.getTrip().getDestination().equalsIgnoreCase("Gdansk"));
    }

    @Test
    public void shouldAddTrip() {
        //given
        Trip trip = new Trip("Baltyk", LocalDate.parse("2021-07-01"), LocalDate.parse("2021-07-15"), "Gdansk", 5000);
        //when
        travelOffice.addTrip(trip);
        //then
        Assertions.assertTrue(travelOffice.findTripByName("Baltyk").equals(trip));
    }

    @Test
    public void shouldFindTripByName() {
        //given
        Trip trip = new Trip("Baltyk", LocalDate.parse("2021-07-01"), LocalDate.parse("2021-07-15"), "Gdansk", 5000);
        travelOffice.addTrip(trip);
        //when
        travelOffice.findTripByName("Baltyk");
        //then
        Assertions.assertEquals(travelOffice.findTripsByDestination("Gdansk").get(0), trip);
    }

    @Test
    public void shouldFindTripsByDestination() {
        //given
        Trip trip = new Trip("Baltyk", LocalDate.parse("2021-07-01"), LocalDate.parse("2021-07-15"), "Gdansk", 5000);
        travelOffice.addTrip(trip);
        //when
        travelOffice.findTripsByDestination("Gdansk");
        //then
        Assertions.assertEquals(travelOffice.findTripByName("Baltyk"), trip);
    }

    @Test
    public void shouldFindTripsAfter() {
        //given
        Trip trip1 = new Trip("Baltyk", LocalDate.parse("2021-07-01"), LocalDate.parse("2021-07-15"), "Gdansk", 2000);
        Trip trip2 = new Trip("Gory", LocalDate.parse("2021-05-01"), LocalDate.parse("2021-05-15"), "Zakopane", 3000);
        Trip trip3 = new Trip("Mazury", LocalDate.parse("2021-08-01"), LocalDate.parse("2021-08-15"), "Mragowo", 4000);
        travelOffice.addTrip(trip1);
        travelOffice.addTrip(trip2);
        travelOffice.addTrip(trip3);
        //when
        List<Trip> tripsAfter = travelOffice.findTripsAfter(LocalDate.parse("2021-06-30"));
        //then
        Assertions.assertTrue(tripsAfter.size() == 2);
    }



}