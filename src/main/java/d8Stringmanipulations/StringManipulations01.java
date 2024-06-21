package d8Stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s="java is easy";
        char first=s.charAt(2); //indeks code
        System.out.println(first);
        String sub1=s.substring(0 ,4);
        System.out.println(sub1 + " " + s.substring(0,4));
        String sub2=s.substring(5 ,7);
        System.out.println( sub2+ " "+s.substring(5,7));

        String sub3=s.substring(8 ,12);
        System.out.println( sub3+ " "+s.substring(8,12));
        String sub4=s.substring(8);
        System.out.println(sub4 );
        boolean sub6=s.startsWith("Easy"); //contains methodu karekterlerin stringde var olup olmadıgını kontrol eder
        System.out.println(sub6);  // ve çıktıyı true veya false üretir .
        boolean sub7=s.endsWith("easy");
        System.out.println(sub7);
    }
}
