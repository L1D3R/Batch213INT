package d20instanceblock_oop;

public class InstanceBlock3 {
    //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.

    //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)
    public  String colar;
    public String fueltpye ;
    //ınstance blok bu clasta her object oluşturulduğunda calışır


    {
        colar="siyah";
        fueltpye="benzinn";
    }


    public InstanceBlock3(){
        System.out.println("araba rengi: "+ colar);
        System.out.println("araba yakıt türü : "+ fueltpye);
    }
    //Default olarak siyah ve benzinle baslatmak istemezsek paramatreli constructor kullaniriz
    public InstanceBlock3(String colar, String fueltpye) {
        this.colar = colar;
        this.fueltpye = fueltpye;
    }
}
