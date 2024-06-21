package d9string_lopps;

public class StringManipulations01 {
    public static void main(String[] args) {

        //1. yol hard code tavsiye edilmez
         String a="absaddc@gmail.com";
        System.out.println(a.substring(4,9));
        //2. yol dinamik code
        String companiy1=a.split("@")[1].split("\\.")[0];
        System.out.println(companiy1);
        //3. yol dinamik yol
        //indexOf() methodu spesifik bir karekterin ilk görğünümünun indexsini verir.
        // bu method olmayan karekterler için -1 verir
        int startingIndex=a.indexOf("@")+1;
        int edingIndex=a.indexOf(".");
        System.out.println(startingIndex + edingIndex);
        String companyName =a.substring(startingIndex,edingIndex);
        System.out.println(companyName);



    }
}
