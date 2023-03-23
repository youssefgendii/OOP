public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double price;

    public GroceryItemOrder(String name, double price)
    {
        this.name=name;
        this.price=price;
    }

    public double getCost()
    {
        return price*quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
}
