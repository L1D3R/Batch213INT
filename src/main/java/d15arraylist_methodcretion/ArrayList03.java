package d15arraylist_methodcretion;

import java.util.*;

public class ArrayList03 {
    public static void main(String[] args) {
        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.

        //Bir interface, bir class’a nasıl davranması gerektiğini tanımlayan bir sözleşmedir.
        // Bir class, bir interface’i implement ettiğinde, interface’deki tüm yöntemleri implement etmelidir.

        //List'i kullanmak, kodunuzun daha esnek ve uyumlu olmasını sağlar.
        //List tipinde bir değişken tanımladığınızda, bu değişkenin farklı List implementasyonlarını
        // (örneğin ArrayList, LinkedList, Vector vb.) tutabilmesi mümkündür.

        //List<Character> b=new Stack<>();
        List<Character> a=new ArrayList<>();

        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a);
        List<Character> b=new ArrayList<>();
        for (Character w: a) {
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);

    }
}
