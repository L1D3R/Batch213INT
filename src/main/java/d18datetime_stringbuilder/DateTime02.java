package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {
        //ornek 1:  Kullanicidan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        Scanner ınput =new Scanner(System.in);
        System.out.println("lütfen doğum tarihinizi giriniz");
        int y= ınput.nextInt();
        int m= ınput.nextInt();
        int d= ınput.nextInt();
      LocalDate date=  LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek()); // getdayweek girilen tarihini gününü verir
        System.out.println();




    }
}
