package d16methodcreation_overloading_passbyvalue;

public class MethodCreation01 {
    public static void main(String[] args) {
         /*Java da Method Olusturma: Java’da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.
        Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir
        ve bu iç class’in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde
        geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz. */

        /* Method Creation - Metot Olusturma
        Java'da method nasil olusturulur?

        1-main method'un disinda, class'in icinde olusturulur
        2-Syntax'i: Access Modifier + Return Type + Method ismi + () + {}
        3-Olusturulan method nasil kullanilir?
            Main icinden method cagrisi yapilmalidir. Buna method Call denir. */
        //main disi
        int sonuc=toplama(3,5); //bunlar argümanlardır
        System.out.println(sonuc);

    }
    public static int toplama(int a,int b){ // buda parametredir.
        return a+ b;
    }
}
