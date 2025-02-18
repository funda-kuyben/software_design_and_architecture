interface Product { // Subject arayüzü
    void addObservers(Member member); // üye ekler

    void removeObservers(Member member); // üye çıkarır

    void notifyObservers(); // üyelere haber verir
}
