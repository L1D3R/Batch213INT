package d15arraylist_methodcretion;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList04 {
    public static void main(String[] args) {
        //Ornek 1:  Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        /*for each kullandiginizda list’lerde eleman sayisini azaltamazsiniz

        Cunku "for each" döngüsü ile bir koleksiyonu veya diziyi dolaşırken, koleksiyonun veya dizinin
        boyutu değişirse, bu, döngünün tutarlılığını bozar. Özellikle, eleman kaldırıldığında, döngü hâlâ
        eski boyutu dikkate alacak, bu da dizi sınırlarını aşabilir veya yanlış elemanlara erişebilir.
        Ayrıca, diğer elemanların dizin numaraları değişecektir, bu da yanıltıcı sonuçlara yol açabilir.

        Concurrent Modification Exception - Eşzamanlı Değişiklik İstisnası olusur.

        Yani bir dongu sayisi for each tarafindan ornegin 4 olarak ayarlanmissa,
        siz bir elemani silince o 4 uzerinden devam etmeye calisacagi icin tutarsizlik olusur */

        List<String> a= new ArrayList<>();
        a.add("manisa");
        a.add("niğde");
        a.add("tokat");
        a.add("van");

        System.out.println(a);

        /*for (String w: a) {
            if (w.contains("a")){
                    a.remove(w);
            }
        }   
        System.out.println(a);*/
        for (int i = 0; i <a.size() ; i++) {
            if (a.get(i).contains("a")){
                a.remove(i);
                i--;
            }
        }
        System.out.println(a);

    }
}
