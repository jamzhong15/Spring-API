package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import test.dao.OrderDao;
import test.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
@Component

public class FoodOrderService implements OrderDao
{
    @Autowired
    private List<Customer> customerList =  new ArrayList<>();

    public void addCustomer(Customer customer)
    {
        customerList.add(customer);
    }

    public void addFoodItem(int id, String name)
    {
        for(Customer customer : customerList)
        {
            if(customer.getId() == id)
            {
                customer.addItem(name);
            }
        }
    }

    public void removeCustomerById(int id)
    {
        for(Customer customer : customerList)
        {
            if(customer.getId() == id)
            {
                customerList.remove(customer);
            }
        }
    }

    public String getCustomerById(int id)
    {
        for(Customer customer : customerList)
        {
            if(customer.getId() == id)
            {
                return customer.customerToString();
            }
        }
        return null;
    }

    public List<String> getAllCustomersString()
    {
        List<String> stringList = new ArrayList<>();
        for(Customer customer : customerList)
        {
            stringList.add(customer.customerToString());
        }
        return stringList;
    }

    public List<Customer> getAllCustomers()
    {
        return customerList;
    }


}
