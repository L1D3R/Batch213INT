package yeniHastane;



// Bu class bir hastanın durumunu ve durumun aciliyetini tutar ve bu bilgilere erişim sağlar.
//extends ifadesi durum sınıfının hasta sınıfından türediğini belirtir .Yani durum sınıfı hasta sınıfından türetilmiş bir alt sınıftır.
// Bu durum da durum sınıfı hasta sınıfının tüm özelliklerine ve davranışlarını miras alır
public class Durum extends Hasta{


    //"actuelDurum " adında bir değişken oluşturduk bu değişken bize hastanın durumunu temsil eder
    private String actuelDurum;
    // "acileyet" adında boolean bir değişken tanımladık bu değişken hastanın durumunun açileyetini belirler
    // true ise acil durum false ise acil olmayan durumu gösterir
    private boolean aciliyet;

    // "getActuelDurum" "setActuelDurum" metotlar sayaseinde private olan actuelDurum değişkenine erişmek ve onu ayarlamak için kullanırlır
    public String getActuelDurum() {
        return actuelDurum;
    }
    public void setActuelDurum(String actuelDurum) {
        this.actuelDurum = actuelDurum;
    }
    // isaciliyet() ve setaciliyet(boolean aciliyet) metotları: Bu metotlar, aciliyet değişkenine erişmek ve onu ayarlamak için kullanılır.
    public boolean isAciliyet() {
        return aciliyet;
    }
    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;
    }
}