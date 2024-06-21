package d7switch_ternary_string;

public class StringManipulations {
    public static void main(String[] args) {
        //String Data type(class)
        //string data tipi ,cumleler kelimeler   semboller rakamlar içerebilirler
        String s="java is easyadi";
         int  sLength=s.length(); //lenght() methodu karekter sayısını bulur.
        System.out.println(sLength);

        char firstChar= s.charAt(0);
        System.out.println(firstChar);

        char fist=s.charAt(11); //static code
        System.out.println(fist); // y

        char lastfirst=s.charAt(s.length()-1); //dynamic code
        System.out.println(lastfirst);
    }
}
