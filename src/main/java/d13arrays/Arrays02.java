package d13arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order'a gore siralar
        Integer[] ages=new Integer[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ ages[ages.length-1]);
        //2- yol mat.max  ve mat.min kullanacağız
        int minumum=ages[0];
        int max=ages[ages.length-1];
        for (int w:ages) {
                minumum=Math.min(minumum,w);
                max=Math.max(max,w);
        }
        System.out.println(minumum +max);
        System.out.println(max);
        System.out.println(minumum);



    }
}
