package d12loops_arrays;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        //do-while döngüsü, döngü bloğundaki kodun en az bir kere çalışacağından
        // emin olmak istediğiniz zaman kullanılır. Yani döngüdeki kodlar,
        // koşul kontrolü yapılırken bile olsa, en az bir kez çalışacaktır.

/*        Baslangic degeri
        do {
            calisacak kodlar
            Artirma/Eksiltme
        } while (Loop calisma kurali);*/

        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdiriniz
        int k=5;
                do {
                    System.out.println(k);
                    k--;
                }while (k>2);
        //Asagidaki kodu inceleyiniz. Bu kodda WHILE dongusune giremez cunku sart saglanmiyor.
        //while-loop da loop'un en basta kirilmasi mumkundur cunku once kural kontrol edilir sonra islem yapilir

        int a = 1;

            while (a < 1) {
            System.out.println("Ben while loop um");
            a++;
        }
            System.out.println("döngü çalışmaz");
            int m=1;
            do {
                System.out.println("ben do while loop um");
                m++;
            }while (m>1);

    }
}
