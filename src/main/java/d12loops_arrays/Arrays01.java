package d12loops_arrays;

import javax.naming.NamingEnumeration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

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
            String [] stdarray= new String[3]; // bu yapıda java da kullanılır
            //String stdaray[]=new String[3];  c dilinde bu genelde kullannılır.
            System.out.println(stdarray);
            String[] STDnAMES2= new String[3];
        System.out.println(Arrays.toString(STDnAMES2));
        //arrays java da arraylerle calışmak için kullanılan yardımcı bir classtır
        // bu classin içindeki toString() mothodu array i yazdırmak için kullanılır .
        //ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console’a yazdiriniz

        int[] num=new int[5];
        System.out.println(Arrays.toString(num));
        //ornek: 10 elemanli integers adinda, Integer  bir array olusturunuz ve console’a yazdiriniz

        Integer[] ıntegers=new Integer[10];
        System.out.println(Arrays.toString(ıntegers));

       // String isimlr=new String[3];
        //System.out.println(Arrays.toString(isimler));
        String[] isimler=new String[3];
        System.out.println(Arrays.toString(isimler));
        isimler[0]="alican";
        isimler[1]="sıla gedemen";
        isimler[2]="müslüm baran";
        //isimler[3]="hakan kaya" ataması yaparsak exception hatası alırız dizi boyutunu aştığımız için

        System.out.println(Arrays.toString(isimler));


    }

}
