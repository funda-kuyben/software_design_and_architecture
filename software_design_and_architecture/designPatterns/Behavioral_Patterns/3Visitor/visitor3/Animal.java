interface Animal { // hayvan arayüzü
    void accept(AnimalVisitor visitor);
}
// Her hayvan, bir ziyaretçiyi kabul edecek bir accept metodu sunar.