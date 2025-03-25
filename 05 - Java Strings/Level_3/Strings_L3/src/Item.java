public class Item {
    int itemCode;
    String itemName;
    double price;
    public void setDetails(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }
    public void displayDetails(int quantity) {
        System.out.println("\nItem Details:");
        System.out.println("Code     : " + itemCode);
        System.out.println("Name     : " + itemName);
        System.out.println("Price    : ₹" + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Cost: ₹" + (price * quantity));
    }
    public static void main(String[] args) {
        Item i = new Item();
        i.setDetails(101, "Notebook", 25.00);
        i.displayDetails(10);
    }
}