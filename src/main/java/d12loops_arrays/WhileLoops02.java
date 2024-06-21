package d12loops_arrays;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {
        Scanner ınp=new Scanner(System.in);
        System.out.println("çarpım tablosunu görmek için bir sayı giriniz ");
        int output=ınp.nextInt();
        int i=1;
        while (i<11){
            System.out.println(output +"x" + i + "=" + (output*i));
            i++;
        }

    }
}
