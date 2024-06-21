package d8Stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s="learn earn 1234 money";
       s= s.replace("money" ,"dolar");
        System.out.println(s);
        s= s.replace("e" ,"");
        System.out.println(s);
        //String  s4="learn java earn 1234 money";
        //String s3=s4.replaceAll("[0-9]","*"); // rakamlar için kullanılır
       // System.out.println(s3);
         int num=s.replaceAll("[^0-9]" , "*").length();
        System.out.println(s.replaceAll("[^0-9]" , ""));
        System.out.println(num);
    }
}
