package d18datetime_stringbuilder;
import javax.sound.midi.MidiFileFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class DateTime01 {
    public static void main(String[] args) {
      //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
      //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

      Scanner ınput=new Scanner(System.in);
      LocalDate girilentarih=null;
      while (true){
        System.out.println("lütfen yılı giriniz :");
        int year= ınput.nextInt(); //yıl bilgisi aldık
        System.out.println("lütfen ayı giriniz (1-12)");
        int month= ınput.nextInt();
        if (month<1 || month>12){
          System.out.println("ay 1 ile 12 arası olmalıdır");
          continue; // kullanıcıyı döngünün başına götürür.
        }
        System.out.println("lütfen günü giriniz");
        int day= ınput.nextInt();
        // o ayın kaç çektiğini görmek için  yearmonth obseji üret
        YearMonth yearMonth=YearMonth.of(year,month);

        int daysInMonth =yearMonth.lengthOfMonth();
        if (day<1 ||day>daysInMonth){
          System.out.println("girilen ay için geçersiz gün lütfen tekrar deneyiziniz");
          continue;
        }
        girilentarih=LocalDate.of(year,month,day);
        if (girilentarih.isBefore(LocalDate.now())){
          System.out.println("geçersiz tarih girdiniz geçmis bir tarih girdiniz lütfen tekrar deneyiniz.");
        }else {
          System.out.println("zamani girebilirsiniz");
          break;

        }


      }



    }

}
