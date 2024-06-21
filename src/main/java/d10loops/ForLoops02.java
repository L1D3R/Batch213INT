package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz. Interview Sorusu
        //           578 ==> 5+7+8=20 ==> Output 20 olmalif

        //for (int i = 578; i > 0; i = i / 10) {
           // sum = sum + i % 10;
        //}

       // System.out.println("sum=" + sum);

        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz
        // Yusuf ==> Ysf

        String a = "Yusuf";
        String unique = "";
        for (int i = 0; i < a.length();i++) {

            char ch = a.charAt(i);

            if (a.indexOf(ch) ==a.lastIndexOf(ch)) {
                unique= unique+ ch;
            }

        }
        System.out.println("tekrarsız :" + unique);



    }
}

