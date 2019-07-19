package test.model;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Customer
{

    private FoodOrder order = new FoodOrder();

    private int id;
    private String name;

    public Customer(int id, String name)
    {
        this.id = id;
        this.name = name;
        order = new FoodOrder();
    }


    public String customerToString()
    {
        return "Customer:"
                + "\n ID ="
                + id
                + "\n Name = "
                + name
                + "\n Order = "
                + orderToString()
                + "\n Total Price = £"
                + order.getOrderPrice();
    }

    public String orderToString()
    {
        List<FoodItem> items = order.getOrder();
        String result = "";
        for(FoodItem item : items)
        {
            result += item.getName() + ", ";
        }
        return result;
    }

    public void addItem(String item)
    {
        order.addItem(item);
    }

    Customer()
    {

    }


}
