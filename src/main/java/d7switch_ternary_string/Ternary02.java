package d7switch_ternary_string;

public class Ternary02 {
    public static void main(String[] args) {
            int a=-123;
            a=Math.abs(a); // bu methodla a ya verdiğiniz değeri mutlak değerini alıp pozitif sonuç verir.
            String result =(a>99 && a<1000)? "3 basamaklıdır":  "3 basamaklı değildir";
        System.out.println(result);

    }
}
