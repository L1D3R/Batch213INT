package d7switch_ternary_string;

public class Ternary01 {
    public static void main(String[] args) {
//        int c=0;
//        //condition? true : false ;
//        int result=c<0  ? -1*c: c;
//        System.out.println(c);
        int a=4;
        int b=7;
         Object sonuc =(a>0&& b>0) || (a<0 &&b<0) ? a*b :"farklı işaretleri sayıları çarpamıyorum.";
        System.out.println(sonuc);

    }
}
