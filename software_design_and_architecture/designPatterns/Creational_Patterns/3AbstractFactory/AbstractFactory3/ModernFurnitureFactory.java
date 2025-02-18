public class ModernFurnitureFactory implements FurnitureFactory { // concrete factory for modern furniture
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
