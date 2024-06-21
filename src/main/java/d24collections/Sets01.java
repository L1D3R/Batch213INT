package d24collections;

import java.util.*;

public class Sets01 {
    public static void main(String[] args) {

        //setler tekrarsız unique datalrı depolamak için kullanılır orneğin e mail tc kimlik no il plaka no

         /*Java’da üç tür set vardır:
        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null’i eleman olarak kabul ederler */

        //Hash kodu gormek istersek;

        String a = "aliye canan";
        System.out.println(a.hashCode()); //ali can= -916486578 //aliye canan=2117369223

        /*2) LinkedHashSet:Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        3) TreeSet:Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir Sorted Set’tir.*/

        //HashSet nasıl oluşturulur?
        HashSet<String> hs=new HashSet<>();
        System.out.println(hs); // içinde hiçlik var null yok

        hs.add("sinan");
        hs.add("kerem");
        hs.add("tuba");
        hs.add("onur");
        System.out.println(hs);
        hs.add("sinan");
        System.out.println(hs);
        hs.add(null); //HashSete null ekleyebiliriz.
        System.out.println(hs); //[sinan, null, kerem, tuba, onur]

        //---------------sete elaman eklemenin kısa yolu
        HashSet<String> sh=new HashSet<>(Arrays.asList("ali","veli"));
        System.out.println(sh);
        Set<String> hs3=Set.of("ayşe","fatma","fate");
        System.out.println(hs3);

        //LinkedHashSet nasıl oluşturulur.
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(13);
        lhs.add(7);
        lhs.add(19);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(13);
        ls.add(7);
        ls.add(19);
        ls.add(11);
        ls.add(null);
        System.out.println(ls);
        //retaionAll() metodu bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğelerin ortak bulmak için kullanılır.

        lhs.retainAll(ls); // değişikliğe uğrayan methodun solundaki
        System.out.println(lhs);
        System.out.println(ls);
        TreeSet<Character> tr=new TreeSet();
        tr.add('G');
        tr.add('A');
        tr.add('Z');
        tr.add('R');
        tr.add('U');
        //tr.add(null); // null koyamayız çünkü TreeSetlerde doğal sıralama yaptığı için null değer kabul etmiyor.
        System.out.println(tr);


        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

       SortedSet<Character> ss =  tr.subSet('G', 'U'); // subString gibi ilki dahil ikincisi hariç
        System.out.println(ss);
        SortedSet<Character> ss1=tr.subSet('B','H');
        System.out.println(ss1);
        TreeSet<Character> ttr=new TreeSet();
        ttr.add('G');
        ttr.add('Z');
        ttr.add('R');
        ttr.add('U');
        System.out.println(ttr);
        SortedSet<Character> ss2=ttr.subSet('B','H');
        System.out.println(ss2);





    }
}
