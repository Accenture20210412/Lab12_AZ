package travelOffice;

public class TravelOffice {
    private Customer[] customers;

    public TravelOffice() {
        customers = new Customer[2];
    }

    public void addCustomers(Customer newCustomer) {
        if(customers[customers.length-1] != null) {
            Customer[] oldCustomers = customers;
            customers = new Customer[oldCustomers.length*2];
            for(int i = 0; i<oldCustomers.length; i++) {
                customers[i] = oldCustomers[i];
            }
        }
        for(int i = 0; i< customers.length; i++) {
            if(customers[i] == null) {
                customers[i] = newCustomer;
                break;
            }
        }
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
