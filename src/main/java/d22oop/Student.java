package d22oop;

public class Student {
    //3.Encapsulation: Data hiding(Veri Saklama)

    // OOP mantiginda class uyelerine erisimi sinirlandirabilirsiniz.
    // Bunu access modifier(erişim değiştiricileri)’larla yapabilirsiniz

    /*
    Ama class’a ulasim disinda ‘access modifier’ larla yapamadigimiz bazi seyleri ‘encapsulation’ ile yapabiliriz.

    1) Encapsulation, verileri koruma ve gizleme amacı taşır. Encapsulation kullanarak
    read ve write (okuma ve yazma) ozelliklerini birbirinden ayri olarak tanimlayabiliriz.

    2) İstedigimize okuma, istedigimize yazma yetkisi veririz.
    ***Bazi insanlar bilgiyi sadece
    gorsun ama degistiremesin. (Mesela,bir personel bir rapora fiyat bilgisi girsin-write-
    ama rapor sonucunu(sirket kar zararini) goremesin. Sirket muduru de raporu okusun -read- ama degistiremesin.
    CEO’da maliyet artislarini yansitabilmek icin hem okusun hemde yazsin gibi)

    a) Data nasil saklanir?
    Access modifier'larini 'private' yaparak datayi diger class'lardan gorunmez hale getiririm
    boylece data'yi saklamis olurum.

    b) Data'yi sakladin ama okuman gerekirse ne yapacaksin?
    get() method'lar olusturarak saklanmis datalari diger class'lardan okuyabilirim

    c) Data'yi sakladin ama o data'yi degistirmen gerekirse ne yapacaksin?
    set() method'lar olusturarak saklanmis datalari diger class'lardan degistirebilirim

    d)Hem okunabilir hemde yazilabilsin diyorsaniz, hem getter hemde setter method’u ayni anda olusturmaliyiz.
     */
    public String name="ali can";
    private int age =13;
    private boolean succesful=true;
    //1 age ve succesful datalarını okunabilir yapalım getter metodu okuma yaptiği için parametre almaz


    public int getAge() {
        return age;
    }
    public boolean isSuccesful(){
        return succesful;
    }
    public String getName(){
        return name;
    }


    // 2 age ve succesful datalarını değiştirebilir yapalim
    //setter metodu yani data üretmez var olan datayı değiştirir
    // bu yüzden return typları hep void olmalıdır
    //setter metotlar ise private elamanlar değer ataması gerçekleştirdiği için paremetre alırlarr


    public void setAge(int age) {
        this.age = age;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }

    // set ve get metotları genellikle(istisna :singleton deseni) static olmaz.cunkü object üzerinden mantık kurulur
}
