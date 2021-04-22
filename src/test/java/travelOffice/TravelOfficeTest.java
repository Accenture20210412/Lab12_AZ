package travelOffice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TravelOfficeTest {

    @Test
    public void shouldAddCustomer() {
        //given
        Customer customer = new Customer("Kuba", "Nowak", "Katowice");
        TravelOffice travelOffice = new TravelOffice();
        //when
        travelOffice.addCustomer(customer);
        //then
        Assertions.assertTrue(travelOffice.getCustomersInfo().contains("Kuba"));
    }

}