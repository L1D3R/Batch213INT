package d24collections;

import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {

        //1) Map’ler sozluk gibidir. Aciklamalidir.  orn: Ali = 13 .Map’ler collections degildir. Ordan miras almaz
        //2) Sol taraf yani key'ler tekrarsizdir. Value tarafi tekrarli olabilir.
        //3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
        //4) Map'in elemanlarina komple 'entry set' (giris elemani) denir.

        //Map nasil olusturulur?

        //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.

        HashMap<String,Integer> mymap=new HashMap<>();
        // put(); bir key -value çiftini mape ekler .
        mymap.put("ali can",13);
        mymap.put("ali can",25); // key tekrarlı kullanıldığında son value aktif olur (override eder) üzerine yazar
        mymap.put("barano",18);
        mymap.put("ayşe kaya",15);
        mymap.put("fatma yılmaz",19);
        System.out.println(mymap);


    }
}
