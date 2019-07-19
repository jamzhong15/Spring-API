package test.model;

import java.util.ArrayList;
import java.util.List;

public class FoodOrder
{
    private List<FoodItem> order = new ArrayList<>();
    private float price = 0f;

    public FoodOrder()
    {
    }

    public List<FoodItem> getOrder()
    {
        return order;
    }
    public float getOrderPrice()
    {
        return price;
    }

    public void addItem(String name)
    {
        FoodItemFactory itemFactory = new FoodItemFactory();
        order.add(itemFactory.addFoodItem(name));
        price += order.get(order.size() - 1).getPrice();
    }











}
