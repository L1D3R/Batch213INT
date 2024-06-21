package d12loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        //Scanner ve Random class'larindan object uretelim
        Scanner scanner= new Scanner(System.in);
        Random random=new Random();
            //0-100 arasında rastgele bir sayı
        int   rastgele= random.nextInt(101); // 20 ile 100 araso
        int denemesayısı=0;
        int tahminedilen;
        boolean tahminDorumu=false;
        System.out.println("0 100 arasında bir sayıyı tahmin etmeye çalış ");
        do {
            System.out.println("tahmininizi yapınız ");
            tahminedilen=scanner.nextInt();
            denemesayısı++;
            if (tahminedilen<rastgele){
                System.out.println("sayı daha büyük");
            } else if (tahminedilen>rastgele) {
                System.out.println("sayı daha küçük");
            }else {
                tahminDorumu =true;
                System.out.println("tebrikler doğru tahmin"+ denemesayısı);
                System.out.println("deneme sayısı:" + denemesayısı);
            }

        }while (!tahminDorumu);
        scanner.close();// actıgınız kaynakları kapatmak iyi bir pragramlama pratigidir.











    }
}
