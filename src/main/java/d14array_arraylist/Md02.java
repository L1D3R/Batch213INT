package d14array_arraylist;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Ornek 1: Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.
        // int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }
      /*  int [][] numbers= {{5,4},{3,2,1}};

        //1.adim: Iki boyutlu bir Array'de kac eleman oldugunu bulan kodu yazalim
        //2.adim: Tek boyutlu Array'i, iki boyutlu Array'in eleman sayisini kullanarak olusturalim
        //3.adim: Iki boyutlu Array'deki elemanlari tek boyutlu Array'e transfer edelim

        //1.adim: Iki boyutlu bir Array'de kac eleman oldugunu bulan kodu yazalim
        int toplamElamanSayısı = 0;
        for (int[] w :numbers) {
            toplamElamanSayısı = toplamElamanSayısı + w.length;
            }
        System.out.println(toplamElamanSayısı);
        //2.adim: Tek boyutlu Array'i, iki boyutlu Array'in eleman sayisini kullanarak olusturalim
        int []  newarr= new int[toplamElamanSayısı];
        System.out.println(Arrays.toString(newarr));
        //3.adim: Iki boyutlu Array'deki elemanlari tek boyutlu Array'e transfer edelim

        int idx=0;
        for (int[] w:numbers ){
            for (int k:w){
                newarr [idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newarr));
        char a='a';*/
        int[] numbers = {1, 2, 3, 4};
        //System.out.println(numbers[0]);
     //  System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[numbers.length] );
       // System.out.println(numbers[3] );

    }
}
