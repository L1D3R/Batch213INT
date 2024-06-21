package d12loops_arrays;

import java.util.Scanner;

public class WhileLoops03 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //           Palindrome: 121 <==> 121        123321 <==> 123321


        Scanner input=new Scanner(System.in);
        System.out.println("gün isimi veriniz:");
        Integer gunIsmi= input.nextInt();

        //int k=121;

        String n=String.valueOf(gunIsmi);
        String reversed=""; // ters çevrilmiş olanı burada saklayaacağız.

        int m=n.length() - 1; //son indeksi alıp m değişkeine yükledil
        while (m>=0 ){
            reversed=reversed+n.charAt(m );
            m--;
        }
        System.out.println(reversed);
        if (n.equals(reversed)){  // equals methodu bir birinin aynısı olup olmadığına bakıyor
            System.out.println("palindrom bir sayıdır");
        }else{
            System.out.println("palindrom bir sayı değildir ");
        }
    }
}
