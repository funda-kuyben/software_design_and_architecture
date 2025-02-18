import java.util.ArrayList;
import java.util.List;

public class ProductItem implements Product { // ConcreteSubject: Ürün
    private List<Member> members = new ArrayList<>();
    private String productName;
    private double price;

    public ProductItem(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void setPrice(double price) {
        if (this.price != price) { // fiyat değişirse
            this.price = price;
            System.out.println("Price pf " + productName + "has been updated to $" + price);
            notifyObservers(); // üyelere haber ver
        }
    }

    @Override
    public void addObservers(Member member) {
        members.add(member);
        System.out.println("A new member has been added to the watclist of" + productName);
    }

    @Override
    public void removeObservers(Member member) {
        members.remove(member);
        System.out.println("A member has been removed from the watclist of " + productName);
    }

    @Override
    public void notifyObservers() {
        for (Member member : members) {
            member.update(productName, price);
        }
    }
}
