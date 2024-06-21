package d7switch_ternary_string;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner ınput=new Scanner(System.in);
        System.out.println("başlangıç ayını giriniz:");
        int aySayısı= ınput.nextInt();
        switch (aySayısı){

            case 1:
                System.out.println("oçak");
            case 2:
                System.out.println("şubat");
            case 3:
                System.out.println("mart");
            case 4:
                System.out.println("nisan");
            case 5:
                System.out.println("mayıs");
            case 6:
                System.out.println("haziran");
            case 7:
                System.out.println("temmuz");
            case 8:
                System.out.println("ağustos");
            case 9:
                System.out.println("eylül");
            case 10:
                System.out.println("ekim");
            case 11:
                System.out.println("kasım");
            case 12:
                System.out.println("aralk");
                break;
            default:

                System.out.println("geçerli bir ay girmediniz");



        }

    }
}
