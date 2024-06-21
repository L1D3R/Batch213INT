package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int age =scanner.nextInt();
        scanner.nextLine();//Kullanilmayan yeni satir karakterini okuyup atarf
        System.out.println("adınızı giriniz :");
        String name =scanner.nextLine();
    }
}
