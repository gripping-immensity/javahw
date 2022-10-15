package homework;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {
    final private TreeMap<Customer, String> customersData;

    public CustomerService() {
        customersData = new TreeMap<>();
    }

    public Map.Entry<Customer, String> getSmallest() {
        var first = customersData.firstEntry();
        if (first == null) {
            return null;
        }

        return copyEntry(first);
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        var higherEntry = customersData.higherEntry(customer);

        if (higherEntry == null) {
            return null;
        }

        return copyEntry(higherEntry);
    }

    public void add(Customer customer, String data) {
        customersData.put(customer, data);
    }

    private Map.Entry<Customer, String> copyEntry(Map.Entry<Customer, String> entry) {
        return new AbstractMap.SimpleEntry<>((Customer) entry.getKey().clone(), entry.getValue());
    }
}
