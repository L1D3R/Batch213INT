package d13arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
         /* Array -dizi

        1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.

        2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
        bir String dizisi sadece String değerler saklayabilir.

        3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
        Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.

        4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir

        5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.

        6)Array’ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
        (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.

    */
        //Array olusturmak

        String[] stdNames1 = new String[3]; //tercih edilen
        //String stdNames2[] = new String[4];

        System.out.println(stdNames1); //@4617c264 heap'teki adres

        //Arrays yardimci class'i kullanilir.

        System.out.println(Arrays.toString(stdNames1)); //[null, null, null]

        //ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console’a yazdiriniz

        int[] notlar = new int[5];
        System.out.println(Arrays.toString(notlar)); //[0, 0, 0, 0, 0]

        //ornek: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));
        //[null, null, null, null, null, null, null, null, null, null]

        //ornek: 3 elemanli isimler adinda, String bir array olusturunuz ve console’a yazdiriniz
        String[] isimler = new String[3];
        System.out.println(Arrays.toString(isimler)); //[null, null, null]

        //Array'e eleman eklemek

        isimler[0] = "Ali Can";
        isimler[2] = "Veli Han";
        isimler[1] = "Ayse Hanim";
        //isimler[3] = "Hasan Kaya"; Hata-bu index yok çünkü diziyi 3 elamanlı olarak tanımladık
        //isimler[0] = "Omer"; //Hata vermez, uzerine yazar

        System.out.println(Arrays.toString(isimler)); //[Ali Can, Ayse Hanim, Veli Han]

        //Bir veriyi gormek icin ise;

        System.out.println(isimler[1]); //Ayse Hanim
        //-----------------------
        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.
        System.out.println(isimler[2]);

        String[] baran = new String[5];
        System.out.println(Arrays.toString(baran)); //heap adresine atar
        baran[0] = "bayburt";
        baran[1] = "sivas";
        baran[2] = "denizli";
        baran[3] = "adana";
        baran[4] = "ankara";
        System.out.println(Arrays.toString(baran));
        int totalchar = 0;
        for (int i = 0; i < baran.length; i++) {
            //baran.length field dir.alan okuması yapar alan okumusı nedir (String [] baran=new String[5]; dizide tanımladığım sayıyısı okur[5]
            totalchar = totalchar + baran[i].length();
            //bu  length() methodtur stringe uygulanır dinamiktir
        }
        System.out.println(totalchar); //30
        //2- yol
        // for   each loop enhanced geliştirilmiş loop;
        // for each loop array yani coklu veri içeren yapılarda kullanılır
        //for looptaki başlangıç bitiş artırma azaltma olaylarını düşünmeyiz
        // veriable ismi olarak da genel kabul w nun kullanılmasıdır.


        // for (datatype veriable :array yada collections){
        //çalışacak kodlar
        // }
        int sum=0;
        for (String msl:baran){
            sum=sum+msl.length();
        }
        System.out.println(sum);





    }

}
