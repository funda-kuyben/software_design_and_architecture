interface IAbstractFactory {
    ICar createCar(String color, double price);

    IMotorCycle createMotorCycle(String type, double price);
}
/*
 * benzer nesnelerin üretimi için her nesneye ait bir fabrika oluşturulur. Bu
 * fabrika sınıflar ise soyut bir ana fabrika sınıfından türer :
 */
