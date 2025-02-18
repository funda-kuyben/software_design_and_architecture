public class Chocolate implements Product { // element sınıflari
    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visitChocolate(this);
    }

    void taste() {
        System.out.println("Çikolatanin tadi muhtesem!");
    }
}
// her ürün, bir ziyartetçiyi kabul edecek şekilde accept metodunu uygular.