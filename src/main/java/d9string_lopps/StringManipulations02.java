package d9string_lopps;

import java.util.SplittableRandom;

public class StringManipulations02 {
    public static void main(String[] args) {
        //lastIndexOf() methodu spesifik bir karekterin son gorunumun index ini verir
        // bu method olmayan karekterler için -1 verir
        //ornek bir stringdeki tekrarsız karekterleri ekrana yan yana yazınız
        //yusuf==> ysf
        String s = "yusuf";
        if (s.indexOf("y") == s.lastIndexOf("y")) {
            System.out.println("y");
        }
        if (s.indexOf("u") == s.lastIndexOf("u")) {
            System.out.println("u");
        }
        if (s.indexOf("s") == s.lastIndexOf("s")) {
            System.out.println("s");
        }
        if (s.indexOf("f") == s.lastIndexOf("f")) {
            System.out.println("f");
        }
        System.out.println();


        String cardnum = "1234 6789 1234 6789";
        String fisrt = cardnum.substring(0, 15).replaceAll("[0-9]", "*");
        System.out.println(fisrt);
        String last = cardnum.substring(15);
        System.out.println(last);
        String result1 = fisrt + last;
        System.out.println(result1);
        String result2 = fisrt.concat(last);
        System.out.println(result2);

    }
}
