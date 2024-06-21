package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        Scanner ınput=new Scanner(System.in);
        System.out.println("lütfen kaçıncı gün oldunu giriniz");
        int num= ınput.nextInt();
        if (num<=0) {
            System.out.println("gün sayılara 1 den küçük olamaz");
        } else if (num==1) {
            System.out.println( "pazar");
        } else if (num==2) {
            System.out.println("pazartesi");
        } else if (num ==3) {
            System.out.println("salı");
        } else if (num==4) {
            System.out.println("çarşamba");
        } else if (num==5) {
            System.out.println("perşembe");
        } else if (num==6) {
            System.out.println("cuma");
        } else if (num>=7) {
            System.out.println("çumartesi");
        }else   {
            System.out.println("gün sayıları 7 den büyük olamaz");
        }
    }
}
