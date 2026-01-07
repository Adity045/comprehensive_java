public class Product {
    
    private String productName;
    private double price;

    
    static String storeName = "General Store";

    
    static void changeStoreName(String newName) {
        storeName = newName;
    }



    
    Product(String productName) {
        this.productName = productName;
        this.price = 0.0;
    }

    
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    void applyDiscount(int flatAmount) {
        price = price - flatAmount;
    }

    boolean isCheaperThan(Product otherProduct) {
        return this.price < otherProduct.price;
    }

    void displayDetails() {
        System.out.println("Store Name : " + storeName);
        System.out.println("Product    : " + productName);
        System.out.println("Price      : $" + price);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

    
        Product.changeStoreName("Tech World");

    
        Product laptop = new Product("Laptop", 1000);
        Product headphones = new Product("Headphones");

        
        headphones.setPrice(50);

        
        laptop.applyDiscount(10.0);
        headphones.applyDiscount(5);

        boolean result = headphones.isCheaperThan(laptop);
        System.out.println("Are Headphones cheaper than Laptop? " + result);
        System.out.println();


        laptop.displayDetails();
        headphones.displayDetails();
    }
}
