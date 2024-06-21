    package d4casting_scanner_increment;

    import java.util.Scanner;

    public class Scanner04 {
        public static void main(String[] args) {

            Scanner s1=new Scanner(System.in);
            System.out.println("kısa kenar giriniz:");
            float shortside=s1.nextFloat();
            System.out.println("uzun kenarı giriniz:");
            float lingside=s1.nextFloat();
            System.out.println( "alan:"+ (shortside *lingside) );
            System.out.println( "çevre:" + (shortside + 2*lingside));




        }
    }
