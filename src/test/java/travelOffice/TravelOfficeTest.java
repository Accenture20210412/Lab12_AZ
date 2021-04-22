package travelOffice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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



}