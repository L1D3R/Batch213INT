package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {


        //Student class'tan bir instance olusturalim
        Student ali = new Student();
        System.out.println(ali.stdName);// alican
        System.out.println(ali.adress);// istanbul
        System.out.println(ali.email);// alican@gmail.com
        //System.out.println(ali.tckimlik); hata çünkü private
        System.out.println(ali);
    }
}
