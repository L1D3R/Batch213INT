package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
            //daha fazla durumlu seneryolarda if else if else statements kullanılır
        Scanner ınput=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz:");
        int num= ınput.nextInt();

        if (num>0) {
            System.out.println(num + "sayı poziftir ");
        }else if (num<0) {
            System.out.println(num+ " sayı negatiftir");
        }else
            System.out.println(num+ "sayı notürdür");


    }
}
