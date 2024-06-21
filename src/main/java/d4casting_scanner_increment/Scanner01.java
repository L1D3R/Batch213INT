    package d4casting_scanner_increment;

    import java.util.Scanner;

    public class Scanner01 {
        public static void main(String[] args) {

           Scanner   giris=new Scanner(System.in); // system.in   klavye üzerinden veri okumak için kullanılır
            System.out.println("lütfen yaşınızı giriniz:" ); // kullanıcıya ne istediğinize dair mesaj verin
             byte age =giris.nextByte();// kullanıcının girdiği veriyi yerel age değişkeni yükledik
            System.out.println(age );

        }
    }
