package d16methodcreation_overloading_passbyvalue;

public class MethodCreation02 {
    public static void main(String[] args) {

        // iki sayıyı carpan bir method oluşturunuz
        int carpma=carpma(3,4);
        System.out.println("carpma=" +carpma);

        // örnek 2 çalıştırma
        int carptopla=carptopla(2,6,8);
        System.out.println( "3 sayınınn sonucu:"+ carptopla);

        //örenk 3
        yaz("alican");
        


    } //main dizisi
    // iki sayıyı carpan bir method oluşturunuz
    protected static int  carpma (int a,int b){
        return a*b;
    }


    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz
    //private : Buraya sadece ayni class icerisinden erisilebilir.
    //Diger class'lar erisemez
    private static int carptopla(int a,int b,int c){
        return a*b+c;
    }
    public static void yaz(String str){
        System.out.println(str);

    }


}
