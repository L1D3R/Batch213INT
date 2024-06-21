package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir sayı giriniz ");
        int num =input.nextInt();
        int ilkikisayı=num/1000;
        int sonsayı=num %100;
        System.out.println(ilkikisayı+sonsayı);



    }
}
