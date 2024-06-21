package d15arraylist_methodcretion;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList05 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz.Interview Sorusu
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //           [12, 23, 10, 19] ==> 12 ve 10

        //Iki turlu sort() kullanabiliriz,
        //1- ArrayList icinde olan (Java 8 sonrasi cikti)
        //2- Collections icinde olan sort()

        ArrayList<Integer> s=new ArrayList<>();
        s.add(12);
        s.add(23);
        s.add(10);
        s.add(19);
        System.out.println(s); //[12, 23, 10, 19]
        //s.sort(null); //    bu sadece arraylist için geçerli

        Collections.sort(s);

        System.out.println(s); //[10, 12, 19, 23]

    }
}
