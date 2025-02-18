interface AnimalVisitor { // Ziyaretçi arayüzü
    // ziyaretçi, her hayvan türüne özgü bir davranış(metot) sağlar.
    void visitTiger(Tiger tiger);

    void visitElephant(Elephant elephant);

    void visitBird(Bird bird);
}
