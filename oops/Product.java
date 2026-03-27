public class Product {
    private int productId;
    private String productName;

    public Product() {
    }

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
    }

    public static void main(String[] args) {
        Product product1 = new Product(1, "xyz");
        product1.displayProduct();
    }
}