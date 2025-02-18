public class ProductY implements IProduct {
    private String productName;
    private double productPrice;

    public ProductY(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "ProductY{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
