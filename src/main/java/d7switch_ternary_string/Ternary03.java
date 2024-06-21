package d7switch_ternary_string;

public class Ternary03 {
    public static void main(String[] args) {
        //(c)?(t):(f)
        int year=2024;
        String result=(year%100==0)?
                ((year%400==0)? ("leep year"):("leep year değil")):
                ((year%4==0)? ("leep year"):("leep year değil"));
        System.out.println(result);
    }
}
