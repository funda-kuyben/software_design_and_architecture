public abstract class Mecmua {
    public abstract String uret();
}
// Bridge tasarım deseni burada devreye giriyor
/*
 * KapakDetaylari referansı ile "detaylar" soyutlamadan bağımsız hale gelir.
 * Bu sayede, kitap veya dergi sınıfının, kapak detaylarının nasıl uygulandığını
 * bilmesi gerekmez. Detaylar, KapakDetaylari tarafından halledilir.
 */
