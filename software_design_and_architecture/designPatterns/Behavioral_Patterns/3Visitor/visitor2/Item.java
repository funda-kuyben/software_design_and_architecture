public interface Item {
    double accept(CartVisitor visitor);
}
/*
 * accept Metodu:
 * Ziyaretçiyi (CartVisitor) çağırarak işlemi gerçekleştirir.
 */