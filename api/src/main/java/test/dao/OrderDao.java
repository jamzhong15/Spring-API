package test.dao;

import org.springframework.stereotype.Repository;
import test.model.Customer;

import java.util.List;

@Repository

public interface OrderDao
{
    void addCustomer(Customer customer);
    void addFoodItem(int id, String name);
    void removeCustomerById(int id);
    String getCustomerById(int id);
    List<Customer> getAllCustomers();
    List<String> getAllCustomersString();

}
