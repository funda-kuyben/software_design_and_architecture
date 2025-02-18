public class ProductX implements IProduct {

    private String productName;
    private double productPrice;

    public ProductX(String productName, double productPrice) {
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
        return "ProductX{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}