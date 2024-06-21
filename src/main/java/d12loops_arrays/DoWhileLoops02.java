package d12loops_arrays;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {
         /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.

       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
          */
        Scanner input= new Scanner(System.in);
        int counter=0;
        do {
            if (counter==4){

                System.out.println("hesabınız bloke olmuştur ");
                break;
            }
            System.out.println("lütfen usurname nizi giriniz");
            String username=input.next();
            System.out.println("lütfen pasword u girinz ");
            String pasword=input.next();

            if (username.equals("admin")&& pasword.equals("pwd123")){
                System.out.println("hesabınıza hoşgeldiniz");
                break;
            }
            counter++;

        }while (true);// sonsuz döngüye girer içerden kırılmadığı sürece çalışacak.

    }
}
