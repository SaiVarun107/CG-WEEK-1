public class Book {
    String title;
    String author;
    double price;
    public void setDetails(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
    }
    public static void main(String[] args) {
        Book b = new Book();
        b.setDetails("Java for Beginners", "John Doe", 399.50);
        b.displayDetails();
    }
}
