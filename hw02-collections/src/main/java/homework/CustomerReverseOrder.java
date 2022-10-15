package homework;

import java.util.Stack;

public class CustomerReverseOrder {
    final private Stack<Customer> customers;

    CustomerReverseOrder() {
        this.customers = new Stack<>();
    }
    public void add(Customer customer) {
        customers.add(customer);
    }

    public Customer take() {
        return customers.pop();
    }
}
