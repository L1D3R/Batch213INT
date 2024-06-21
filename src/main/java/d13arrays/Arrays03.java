package d13arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
//Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //Array leri kisa yoldan nasil olusturabiliriz?
        // =‘den sonra {} acar, degerleri yazariz
        int [] number={12,3,-3,5,23};
        System.out.println(Arrays.toString(number));
        for (int w:number) {
            if (w<5) {
                System.out.print(w + " ");


                //Ornek 2: Spesifik bir elemanin Array'de olup olmadigini anlamak icin gereken kodu yaziniz

                //binarySearch() methodu var olan elemanlar icin size o elemanin index’ini verir
                //binarySearch() methodunu sort() kullanmadan kullanmayiniz
                //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
                // "-" ==> isaretinin anlami eleman yok demektir

        /*
        Yani, metot şu şekilde çalışır:
            Diziyi ikiye bölün.
            Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
            Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
            Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
            Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar tekrar edilir.
         */

               int[] arr={1,2,7,6};
               Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
                System.out.println(Arrays.binarySearch(arr,2));
                System.out.println(Arrays.binarySearch(arr,7));
                System.out.println(Arrays.binarySearch(arr,3));// -3 olurdu
                System.out.println(Arrays.binarySearch(arr,9));//-5 olurdu sebebi ise olsaydı sıralama numarasının negatif sonucunu alıyor ve -1 den çıkarıyor
              String[] str={"A","B","C","D"};
              Arrays.sort(str);
                System.out.println(Arrays.toString(str));
                System.out.println(Arrays.binarySearch(str,"A")); //0
                System.out.println(Arrays.binarySearch(str,"C"));//2
                System.out.println(Arrays.binarySearch(str,"E"));//-5
                System.out.println(Arrays.binarySearch(str,"G"));//-5


                String s="java is easy. Learn java earn money";
                System.out.println(s);
               String[] words= s.split(" ");
               String a=Arrays.toString(words);

              String fad=Arrays.toString(words);
                System.out.println(fad);
                System.out.println(words.length);
                System.out.println(Arrays.toString(words)); // 7 alırız
               System.out.println(words.length);






            }

        }
    }
}
