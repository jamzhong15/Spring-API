package test.model;

public class FoodItemFactory
{
    public static FoodItem addFoodItem(String item)
    {
        if(item.equalsIgnoreCase("burger"))
        {
            return new FoodItem("Burger", 6.0f);
        }
        else if(item.equalsIgnoreCase("fries"))
        {
            return new FoodItem("Fries", 2.0f);
        }
        else if(item.equalsIgnoreCase("wings"))
        {
            return new FoodItem("Wings", 3.0f);
        }
        else
            {
                return null;
            }
    }

}
