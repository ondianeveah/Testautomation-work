package TestAutomation;

public class Customer {
    public static void main(String[] args) {
        Product book = new Book();
        book.setPrice(10.99);
        book.setColor("Blue");
        book.setName("To Kill A Mockingbird");
        System.out.println(book.getPrice());
    }
}
