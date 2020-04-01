package TestAutomation;

public interface Product {
// if properties are defined in interface they have to remain final

    double getPrice();
    void setPrice(double price );

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

   default String getBarcode(){
       return "No barcode";
   }
}
