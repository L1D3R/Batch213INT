package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

        System.out.println("adınızı ve soyadınızı giriniz");
        String fulname=s1.nextLine(); //nextLine() methodu ile birden fazla kelime girdisi alabiliriz
        System.out.println("yaşınızı giriniz");
        byte age=s1.nextByte();
        System.out.println("boyunu giriniz");
        float boy=s1.nextFloat();
        System.out.println("kilonuzu giriniz");
        short kilo=s1.nextShort();
        System.out.println("medeni durumunuzu giriniz");
        String maritalstatus=s1.next();
        System.out.println("fulname = " + fulname);
        System.out.println("age = " + age);
        System.out.println("boy = " + boy);
        System.out.println("kilo = " + kilo);
        System.out.println("maritalstatus = " + maritalstatus);
        //ODEV: nextLine'in enter'la bos gecmesini do-while dongusu ile duzeltiniz


    }
}
