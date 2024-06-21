package d4casting_scanner_increment;

import java.util.Locale;
import java.util.Scanner;


public class Scanner03 {
    public static void main(String[] args) {
       /* Scanner input=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz :");
        int sayı1=input.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        int sayı2 =input.nextInt();
        System.out.println("sayı1 = " + sayı1);
        System.out.println("sayı2 = " + sayı2);
         int toplam=sayı2+sayı1;
         int çıkarma=sayı1-sayı2;
         int çarpma=sayı1*sayı2;
         int bolme=sayı1/sayı2;

        System.out.println( "toplam: " + toplam);
        System.out.println( "çıkarma: " + çıkarma);
        System.out.println( "çarpma: " + çarpma);
        System.out.println( "bölme: " + bolme);*/

        Scanner input = new Scanner(System.in).useLocale(Locale.CANADA);
        System.out.println("Lutfen iki sayi giriniz");

        float firstNumber = input.nextFloat();
        float secondNumber = input.nextFloat();

        System.out.println("Toplam : " + (firstNumber + secondNumber));
        System.out.println("Fark : " + (firstNumber - secondNumber));
        System.out.println("Carpim : " + (firstNumber * secondNumber));
        System.out.println("Bolum : " + String.format("%.3f",(firstNumber / secondNumber)));
    }
}
