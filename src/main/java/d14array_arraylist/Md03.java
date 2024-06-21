package d14array_arraylist;

public class Md03 {
    public static void main(String[] args) {
        //Ornek 1: int turunde bir Multidimensional Array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
            int [][] ages= {{15,4},{12,43,21}};
            int enkucuk=ages[0][0];
            int enbuyuk =ages[0][0];

            for (int[] w:ages){
                for (int k:w){
                    enbuyuk=Math.max(enbuyuk,k);
                    enkucuk =Math.min(enkucuk,k);
                }
            }
        System.out.println(enbuyuk+ enkucuk);
        System.out.println(enbuyuk);
        System.out.println(enkucuk);





        //System.out.println(ages[0][1]+ages[1][1]);
    }
}
