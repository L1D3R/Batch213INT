package d16methodcreation_overloading_passbyvalue;
import java.util.ArrayList;
public class ArrayList01 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz.Interview Sorusu
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //           [12, 23, 10, 19] ==> 12 ve 10

        //Iki turlu sort() kullanabiliriz,
        //1- ArrayList icinde olan (Java 8 sonrasi cikti)
        //2- Collections icinde olan sort()
        ArrayList<Integer> a=new ArrayList();
        a.add(12);
        a.add(23);
        a.add(10);
        a.add(19);
        a.add(8);
        a.sort(null); // sort elemanları sıralar
        System.out.println(a);
        int minfark=a.get(1)-a.get(0);
       // System.out.println(minfark);
        for (int i = 1; i <a.size() ; i++) {
            minfark=Math.min(minfark,a.get(i)-a.get(i-1));
            
        }
        System.out.println(minfark);
        System.out.println();
        //En kucuk (minFark) hangi iki sayidan elde ettigimizi bulalim

        for (int i = 1; i < a.size(); i++) {
            if (a.get(i)-a.get(i-1) ==minfark){
                System.out.println(a.get(i) + " ve " + a.get(i-1));

            }

        }


    }
}
