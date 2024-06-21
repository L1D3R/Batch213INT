package d11loops;

public class ForLoops01 {
    public static void main(String[] args) {
        //ornek 1: 6'dan 10'a kadar tum int’lerin toplamini console'a yazdiriniz
        //           6+7+8+9+10=40 ==> 40
        int carpım=1;
        for (int i = 10; i >6  ; i--) {
            carpım= carpım * i;
        }
        System.out.println(carpım);
    }
}
