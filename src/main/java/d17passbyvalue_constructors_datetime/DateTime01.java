package d17passbyvalue_constructors_datetime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //Date Data Tipi

        //LocalDate java.time paketinde yer alan bir classtir.
        //Bu sınıf, tarih bilgilerini temsil etmek ve işlemek için kullanılır.
        //Java'da java.time.LocalDate class’i, yerel tarihleri temsil etmek için kullanılır
        // ve saat bilgisini içermez, yani sadece gün, ay ve yıl bilgilerini içerir.

        //---------------
        //ornek 1: now(): Geçerli tarihi alır. Tarih bilgisini yerel bilgisayarınızın saatinden alır,
        // yani sizin bilgisayarınızın saatinden gelir

        LocalDate myDate = LocalDate.now(); //now() methodu statik bir methoddur.Class ismiyle cagirilir.

        //String s = "Ali Can";
        //s.substring(3,5) ==> substring non-static'tir cunku class ile degil object ile ulastik
        //String s = "Ali Can";
        //s.substring(3,5) ==> substring non-static'tir cunku class ile degil object ile ulastik

        //Math.min(a,b) ==> static method

        System.out.println(myDate); //2024-02-06

        //----------------
        //ornek 2 : getMonthValue(): Tarihin ayını (1-12 arasında) alır.
        //getMonth(): Bu metod ayı dondurur. (Month enum türünde)

        //Java'da Month veri türü, bir enum (enumeration) türüdür (numaralandırma türüdür).
        //Degisme ihtimali olmayan datalari depolamak icin kullanilir. Haftanin gun isimleri, Ay isimleri gibi
        System.out.println(myDate.getMonthValue());
      Month ay= myDate.getMonth();
        System.out.println(ay);
        //ornek 3: getYear(): Tarihin yılını alır.
        System.out.println(myDate.getYear());
        System.out.println(myDate.getDayOfYear());



        int gun=myDate.getDayOfMonth();
        System.out.println(gun);
        DayOfWeek gün2=myDate.getDayOfWeek();
        System.out.println(gün2);
        //ornek 5:
        //ileriki tarihe nasil gidilir?
        //plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //Bu methodlar, orijinalleri değiştirmez, yeni bir gun, ay ve tarih nesnesi oluşturur.
        LocalDate newdate=myDate.plusYears(1).plusMonths(1).plusDays(4);
        System.out.println(newdate);

         /*ornek 6:Gecmis tarihe nasil gidilir?
        minusYears(): Bir LocalDate veya LocalDateTime nesnesinden belirtilen yıl sayısını çıkarır.
        minusMonths() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen ay sayısını çıkarır.
        minusDays() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen gün sayısını çıkarır.
        Sonuç olarak, çıkarma işleminden sonra elde edilen tarihi döndürürler.*/

        LocalDate newdate2=myDate.minusYears(1).minusMonths(3).minusDays(1);
        System.out.println(newdate2);

        LocalDate newdare= LocalDate.of(2980,8,3);
        LocalDate newdare2= LocalDate.of(2010,5,4);

        //isAfter(): Bir tarihin başka bir tarihten sonra olup olmadığını kontrol eder.boolean verir
        //isBefore(): Bir tarihin başka bir tarihten once olup olmadığını kontrol eder.boolean verir

        boolean sonrami =newdare.isAfter(newdare2);
        System.out.println(sonrami);
        boolean oncemi=newdare.isBefore(newdare2);
        System.out.println(oncemi);

        //ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner ınput=new Scanner(System.in);
        System.out.println("lütfen yılı giriniz :");
        int year= ınput.nextInt();
        System.out.println("lütfen ayı giriniz (1-12):");
        int month = ınput.nextInt();
        System.out.println("lütfen günü giriniz :");
        int days= ınput.nextInt();

        LocalDate girilenyıl=LocalDate.of(year,month,days);
        if (girilenyıl.isBefore(LocalDate.now())){ // girilen tarih şu andan onceyse
            System.out.println("geçersizz tarih girdiniz");

        }else {
            System.out.println(" girilen zamanı girebilirsin ");
        }
    }

}
