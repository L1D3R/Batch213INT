package d11loops;

import java.util.Scanner;

public class ForLoops03 {
    public static void main(String[] args) {
            double num=28.587;
            String snum= String.valueOf(num);
           String decımalpart= snum.split("[\\.]")[1];
           int intdecımalpart=Integer.valueOf(decımalpart); //unboxing
        System.out.println(decımalpart);
        int sum=0;
        for (int i = intdecımalpart; i >0 ;i= i/10) {

            sum =sum+i%10;
        }

        System.out.println(sum);


    }

}
