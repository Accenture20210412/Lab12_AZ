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
        Trip trip = new Trip("Gdansk", LocalDate.parse("2021-07-01"), LocalDate.parse("2021-07-15"), "Gdansk", 5000);
        //when
        travelOffice.addTripToCustomer(customer, trip);
        //then
        Assertions.assertTrue(customer.getTrip().getDestination().equalsIgnoreCase("Gdansk"));
    }

    @Test
    public void shouldAddTrip(){
        //given

        //when

        //then
    }

}