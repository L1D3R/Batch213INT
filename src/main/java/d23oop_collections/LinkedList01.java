package d23oop_collections;

import java.util.*;

public class LinkedList01 {
    public static void main(String[] args) {
         /*Collections (koleksiyonlar), Object’leri depolamak ve işlemek için kullanılan
        bir class’lar ve interface'ler kümesidir.

        —Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
                Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
                Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
                Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
                Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.

        —Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
                Verileri verimli bir şekilde depolamak
                Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
                Verileri güvenli bir şekilde depolamak*/
        //----------------------------------
        /*Java da Array’ler neden eksik kaldi da Collection’lar gelistirildi?

        Java’da array'ler eksik kaldı çünkü:

        Boyutları statiktir: Bu, array'lerin dinamik olarak büyüyemediği veya küçülemediği anlamına gelir.
        İç içe geçmiş array'ler karmaşıktır: Bu, array'lerin birbirleriyle ilişkili olduğu durumlarda karmaşık ve hata yapmaya müsaittir.
        Array'ler genel olarak verimli değildir: Bu, ekleme, silme ve arama gibi işlemler için genellikle daha yavaştır.

        Collections, bu dezavantajları çözmek için tasarlanmıştır.*/
        //-----------------------------------
        /*LinkedList: Bağlı bir listedir.

        LinkedList’ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
        LinkedList'in içinde bulunan node'ların konumunu temsil eder.

        ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir.
        Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir.
        Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.

        1)Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir.
        Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan
        başlayarak ilerlemeyi gerektirir. Yani ArrayList’e gore erisim yavastir.
        ArrayList’lerde get(index) ile hizli erisiriz. Ama LinkedList’ler en bastan istenen eleman mi diye
        tek tek bakar.

        2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.

        3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/


        /*ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Object list3 = new ArrayList<>();*/
        //List<String> list4 = new List(); HATA,interface'ler constructor tarafinda kullanilamazlar
        /*
        LinkedList<String> mylist=new LinkedList<>();
        //1 add(): listeye elaman ekler
        mylist.add("müslüm");
        mylist.add( "baran");
        mylist.add("ferhat");
        mylist.add("fatma");
        System.out.println(mylist);
        // ekstra bilgi  kısa yolla ekleme
        LinkedList<String> linkedList=new LinkedList<>(Arrays.asList("müslüm","baran","ferhat","fatma"));
        System.out.println(linkedList);
        LinkedList<String> linkedList2 =new LinkedList<>(List.of("baran","gökhan","mehmer","sidar")); // boyutunu değiştirebiliriz
        System.out.println(linkedList2);
        linkedList2.add("devran");
        System.out.println(linkedList2);
        List<String> immutableList =List.of("elaman1","elaman2","elaman3"); // boyutunu değiştiremeyiz
        //immutableList.add("sekan");
        System.out.println(immutableList);
        // 2- add(int index ,E elementt); belirtilen konuma bir öge ekler
        mylist.add(1,"zeynep");
        System.out.println(mylist);
        //3- addFirst(E e): listenin başına öğe ekler
        mylist.addFirst("hasan");
        System.out.println(mylist);
        //4- addLast(E e): listenin sonuna bir öğe ekler
        mylist.addLast("tuba");
        System.out.println(mylist);
        // 5)remove(object o ): belirtilen öğeyi listeden kaldırır ve boolean döndürür
        boolean m1=mylist.remove("müslüm");
        System.out.println(m1);
        System.out.println(mylist);

        //6)removeFirstOccurrence() metodu,
        // belirtilen bir öğeyi LinkedList içinde
        //bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.
        mylist.removeFirstOccurrence("baran");
        System.out.println(mylist);
        mylist.add("yusuf");
        mylist.add(3,"yusuf");
        System.out.println(mylist);

         */

        LinkedList<String> mylist=new LinkedList<>();

        mylist.add("müslüm");
        mylist.add( "baran");
        mylist.add("ferhat");
        mylist.add("fatma");
        mylist.add("yusuf");
        mylist.add(3,"yusuf");
        mylist.removeFirstOccurrence("yusuf");
        System.out.println(mylist);
        /*
        System.out.println(mylist);
        // eğer birden fazla bilgi veya data varsa nasıl silecez
        mylist.removeAll(Collections.singleton("yusuf"));
        System.out.println(mylist);

         */

        //7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
        //sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
        //Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.
        mylist.removeLastOccurrence("yusuf");
        System.out.println(mylist);


        //8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
        // Bu metod, elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa null dondurur)

       String  s =mylist.peek();
        System.out.println(s);
        System.out.println(mylist);


        //9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa null döndürür.


       String p= mylist.poll();
        System.out.println(p);
        System.out.println(mylist);



        //10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
        // bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir

        System.out.println(mylist.element());
        System.out.println(mylist);



        //11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
        // Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)

        System.out.println(mylist.pop());
        System.out.println(mylist);

    }
}
