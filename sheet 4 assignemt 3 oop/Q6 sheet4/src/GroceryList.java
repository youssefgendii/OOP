import java.util.ArrayList;
public class GroceryList {
    private ArrayList<GroceryItemOrder> gItems = new ArrayList<GroceryItemOrder>();
    private int itemsNum=0;
    public GroceryList(){}

    public void add(GroceryItemOrder item)
    {
        if(itemsNum<10)
        {
            gItems.add(item);
            itemsNum++;
        }
        else
        {
            System.out.println("List is full");
        }
    }

    public double getTotalCost()
    {
        double totalCost=0;
        for(int i=0;i<itemsNum;i++)
        {
            totalCost+=gItems.get(i).getCost();
        }
        return totalCost;
    }



}
