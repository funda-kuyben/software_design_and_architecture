interface ProductVisitor { // visitor arayüzü
    void visitChocolate(Chocolate chocolate);

    void visitFlower(Flower flower);

    void visitToy(Toy toy);
}
// Ziyaretçi, her ürün türü için bir işlem gerçekleştirir.
