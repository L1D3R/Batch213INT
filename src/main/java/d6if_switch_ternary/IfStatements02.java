package d6if_switch_ternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        // nested iç içe geçmiş demektir
        Scanner ınput =new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz:");
        String gender =ınput.next();
        System.out.println("yaşınızı giriniz :");
        int age= ınput.nextInt();

        if (gender.equalsIgnoreCase("erkel")) {
            if (age < 0) {
                System.out.println("yaş negatif olamaz ");
            } else if (age < 16) {
                System.out.println("kişi 16 yaşından büyük  çalışmamalı ");
            } else if (age <= 65) {
                System.out.println("çalışmalı ");
            } else {
                System.out.println("emekli olmalı");
            }
        }else if (gender.equalsIgnoreCase("kadın")) {
            if (age<0) {
                System.out.println("yaş negatif olamaz ");
            } else if (age<18) {
                System.out.println("çalışmamalı");
            } else if (age<=60) {
                System.out.println("çalışmalı");
            }else{
                System.out.println("emekli olmalı ");
            }


        }else{
            System.out.println("sizin için farklı bir tanımlama yapılmadı");
        }
    }
}
