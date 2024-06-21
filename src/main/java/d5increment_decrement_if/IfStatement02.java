package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
//        Scanner num=new Scanner(System.in);
//        System.out.println("bir sayı giriniz");
//
//        int input= num.nextInt();
//        if (input %2==0 ){
//            System.out.println("sayı çiftir");
//        }
//        if (input% 2!=0) {
//            System.out.println("sayı tektir");

        Scanner num = new Scanner(System.in);
        System.out.println("bir sayı giriniz");

        int input = num.nextInt();
        if (input % 2 == 0) {
            System.out.println("sayı çiftir");
        }else
            System.out.println("sayı tektir");

    }
}

