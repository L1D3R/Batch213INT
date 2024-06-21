package d24collections;

import java.util.*;

public class Queue01 {
    public static void main(String[] args) {
           /* Java’da Queue, verilerin belirli bir düzen içinde saklandığı ve işlendiği bir veri yapısıdır.
        Ilk giren ilk çıkar (FIFO-first in first out) prensibine dayanır, yani ilk eklenen obje ilk çıkarılır.
        Queue, sıralı işlemler ve verilerin işlenmesi için kullanılır. Araya eleman eklemek mümkün değildir.

        İşte gerçek dünyadan birkaç örnek:
     Sıra Kuyruğu (Queue): Sıra bekleyenlerin önünde olan kişi önce hizmet alır. Bir örnek olarak,
         bir fast-food restoranındaki siparişlerin işlenmesini düşünebilirsiniz.
         İlk gelen sipariş, ilk hazırlanan ve teslim edilen sipariştir.
     Bilet Sırası: Bir konser veya etkinlik için bilet almak isteyen kişiler sıraya girerler.
         Biletler, sırayla satılır ve ilk gelen kişi ilk biletini alır.
     Çağrı Sırası: Müşteri hizmetleri çağrı merkezindeki müşteriler, sırayla operatörlere bağlanır.
         İlk çağrı bekleyeni önce konuşur, ardından sıradaki çağrı alınır.
     Dosya İşleme: Bilgisayar işletim sistemleri ve uygulamalar, dosyaları sırayla işlerler.
         Bir dosya işlem tamamlandığında, sıradaki dosya işlenir.

    Kuyruğun çalışma mantığı, elemanların kuyruğun sonuna eklenip başından çıkarılması şeklinde gerçekleşir.
    Queue, sıralı işlemler veya veriler gerektiğinde kullanışlıdır.

    Queue interface’i, LinkedList ve PriorityQueue gibi farklı sınıflar tarafından uygulanabilir. */
        //Queue nasil olusturulur?
        Queue<String > depo =new LinkedList<>();

        // Queue ya nasıl elaman eklenir ?
        // 1) add(); belirtilen öğeyi kuyruğa ekler
        depo.add("sut");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo); //[sut, et, yumurta, peynir] - insertion order
        //2 remove(); kuğrugun başındaki öğeyi kuyruktan kaldırır ve döndürür
        // kuyruk boşsa bir istisna fırlatır.
        String s =depo.remove();
        System.out.println(s);
        System.out.println(depo);
        //3 peek(); kuyruğun başındaki öğeyi döndürür. kuyruk boşsa null döner
        System.out.println(depo.peek());// et
        System.out.println(depo);// [et, yumurta, peynir]

        //4) clear(); metodu kuğrugun içindeki tüm öğeleri kaldırır böylece kuyruk boş bir duruma gelir.
       // System.out.println(depo.clear()); // hata
        depo.clear();
        System.out.println(depo);
        //5) poll(); kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür kuyruk boşsa null döner
        System.out.println(depo.poll());

        //6) element(); kuyruğun başındaki öğeyi döndürür ancak kuyruk boşsa bir istisna fırlatır .
       // System.out.println(depo.element());

        //-------------------------
        // PriorityQueue (oncelik kuyrugu), bir FIFO (first in first out) yapısı ile nesneleri
        // öncelik sırasına göre sıralayan bir kuyruk (Queue) aracıdır.
        // Yani, en yüksek önceliğe sahip olan nesne, her zaman ilk olarak çıkar.

        //Örneğin, sayıları içeren bir PriorityQueue kullanıyorsanız,
        // sayılar kendi doğal sıralamalarına göre önceliklendirilir.

        //Gerçek hayattan bir örnek olarak, bir hastanedeki hastaların acil servise giriş sırası
        // priorityQueue olarak temsil edilebilir. Hastalar, aciliyet derecelerine göre sıralanır.
        // Aciliyeti en yüksek olan hasta, her zaman ilk olarak tedavi edilir.

        //---------------PriorityQueue nasil olusturulur?
        PriorityQueue<String> acilsırası= new PriorityQueue<>();
        // PriorityQueue ya nasıl elaman eklenir?
        // add(); belirtilen öğeyi kuyruğa ekler
        acilsırası.add("mehmet");
        acilsırası.add("mahmut");
        acilsırası.add("ekrem");
        acilsırası.add("oya");
        acilsırası.add("tansu");
        System.out.println(acilsırası);
        //-------------------------
        //Deque (Double-Ended Queue), hem başından hem de sonundan eleman eklemeye
        // ve çıkartmaya izin veren bir veri yapısıdır.
        // Deque, FIFO (first in first out) veya LIFO (last in first out) olarak sıralanabilir.

        //Gündelik hayatta kullanılabilecek bazı Deque örnekleri:

        //1) İnternet Tarayıcıları: İnternet tarayıcıları, kullanıcıların web sayfalarını gezdikçe
        // birçok sayfayı bir araya getirir. Bu sayfaları tarayıcı geçmişi adı verilen bir veri
        // yapısında saklar. Kullanıcılar geri ve ileri tuşlarına bastığında, bu geçmişteki sayfalar
        // Deque mantığıyla işlenir. Kullanıcı son ziyaret ettiği sayfadan geri gitmek istediğinde
        // veya ileri gitmek istediğinde Deque yapısı kullanılır.

        //2) Geri Al/Yeniden Uygula: Çoğu yazılım uygulaması, kullanıcıların yaptıkları işlemleri geri
        // almasına ve tekrar uygulamasına olanak tanır. Örneğin, metin düzenleyicilerde bir yazıyı
        // yazdıktan sonra geri al (command + z) tuşuna bastığınızda, son yapılan işlem geri alınır.
        // Bu işlemi uygulamak için bir Deque kullanabilirsiniz.

        //---------------Deque nasil olusturulur?

        Deque<String> d=new LinkedList<>(); // bu yapı daha çok kullanılıyor

        //Deque e nasıl elaman eklenir
        // add(); belirtilen öğeyi ekler
        d.add("mehmet");
        d.add("mahmut");
        d.add("ekrem");
        d.add("oya");
        d.add("tansu");
        System.out.println(d);
        //1 addFirst (E e ); DEque in başına bir öğe ekler dönüş türü veid dir çünkü
        // sadece eklemeyi gerçekleştirir ve değer döndürmez
        d.addLast("ayça"); // bu metod sona ekleme yapar
        d.addFirst("ali"); // nuda başa ekleme yapar
        System.out.println(d);
        for (String w: d){ // ayrı satırlarda elemanları yazdıralım
            System.out.println(w);
        }

        //2) addLast(); Deque nin sonuna bir öğe ekler dönüş türü yine void dir.
        d.addLast("hasan");
        for (String w :d) {
            System.out.println(w);
        }

        //3 removeFirst();  Deque nin başındaki öğeyi kaldırır ve kaldırılan öğeyi döndürür.
        // bu metod E türünde bir değer döndürür (burda String)
        System.out.println(d.removeFirst()); // ali kalktı
        System.out.println(d);  //[mehmet, mahmut, ekrem, oya, tansu, ayça, hasan]

        //ArrayDeque Java'da çift yönlü kuyruk (double-ended queue) yapısını temsil eder
        // (verilerini bir dizi (array) içinde saklar) ve Deque arayüzünü uygular.
        // Bu yapı, hem baştan hem sondan ekleme ve çıkarma işlemlerine izin verir.
        // ArrayDeque, LinkedList'e kıyasla daha yüksek performans sunar çünkü içerikleri için dizi tabanlı
        // bir yapı kullanır. ArrayDeque, başta ve sonda hızlı ekleme/çıkarma işlemleri için idealdir.

        //ArrayDeque Nasıl Oluşturulur?
        ArrayDeque<String> ar=new ArrayDeque<>();

        //Eleman Nasıl Eklenir?

        // Baştan Ekleme: addFirst()
        // Sondan Ekleme: addLast()
        ar.addFirst("ilk");
        System.out.println(ar);
        ar.addLast("son");
        System.out.println(ar);


        //Eleman Çıkarma:
        //removeFirst(): Kuyruğun başından bir eleman çıkarır.
        //removeLast(): Kuyruğun sonundan bir eleman çıkarır.
        String ilk= ar.removeFirst();
        System.out.println(ilk);
        System.out.println(ar);
        String son=ar.removeLast();
        System.out.println(son);
        System.out.println(ar);





    }
}
