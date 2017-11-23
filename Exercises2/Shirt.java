
public class Shirt {
    public int shirtID = 123;
    public String description = "Nice shirt";
    public char colorCode = 'B';
    public double price = 9.96;
    public int quantityInStock = 1000;

    public void information(){
          System.out.println("Shirt ID: "+ shirtID);
          System.out.println("Description: "+ description);
          System.out.println("Color Code: "+ colorCode);
          System.out.println("Price: "+ price);
          System.out.println("Quantity in stock: " + quantityInStock);
    }
}