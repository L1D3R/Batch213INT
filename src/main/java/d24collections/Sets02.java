package d24collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.
        long t1= System.nanoTime();
        //1---- YOL

        TreeSet<String> mail=new  TreeSet<>();
        mail.add("abc262@gmail.com");
        mail.add("muslumbaran92@gmail.com");
        mail.add("müslüm251@gmail.com");
        mail.add("barano463@gmail.com");
        mail.add("baran686@gmail.com");
        System.out.println(mail);
        //2--------YOL
        TreeSet<String> mail1=new  TreeSet<>(Arrays.asList("avzdq@gmail.com","muslumbaran92@gmail.com"));
        System.out.println("mail1 :" +mail1);

        long t2=System.nanoTime();
        // 3------ YOL ama karışık verdi
        HashSet<String > mail2= new HashSet<>();
        mail2.add("abc262@gmail.com");
        mail2.add("muslumbaran92@gmail.com");
        mail2.add("müslüm251@gmail.com");
        mail2.add("barano463@gmail.com");
        mail2.add("baran686@gmail.com");
        System.out.println(mail2);
        // boş bi treeSet oluşturalım constructor ile hashSeti yazalım

        TreeSet<String> email=new TreeSet<>(mail2);
        System.out.println(email);
        long t3=System.nanoTime();
        System.out.println(t2-t1);
        System.out.println(t3-t2);

    }
}
