public class Main {
    public static void main(String[] args) {
        GroceryList list1=new GroceryList();
        GroceryItemOrder item1=new GroceryItemOrder("pepsi",20);
        GroceryItemOrder item2=new GroceryItemOrder("coffee",62);
        GroceryItemOrder item3=new GroceryItemOrder("milk",145);
        item1.setQuantity(10);
        item2.setQuantity(2);
        item3.setQuantity(1);
        list1.add(item1);
        list1.add(item2);
        list1.add(item3);
        System.out.println("your item total cost is  : " + list1.getTotalCost());
    }
}