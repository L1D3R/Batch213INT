package d8Stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        //valueOf() bu method Strinf ifadeleri double a cevirir .

        String tv="$456.99";
        String leptop="$875.99";
        tv =tv.replace("$" ,"");
        leptop=leptop.replace("$","");
        Double totalprice= Double.valueOf(tv)+ Double.valueOf(leptop);
        System.out.println(totalprice);

        String name  ="   ali cAN";
        char first =name.trim().toUpperCase().charAt(0); // trim() baştaki ve sondaki boşlukları siler uppercase() hepsini büyütür charAT() indeksle çalışır
        System.out.println(first);
        char last= name.trim().toUpperCase().split(" ")[1].charAt(0);
        // char last= name.trim().toUpperCase().split("\\s+ ")[1].charAt(0);
         //  (\\s+) ifadesi bir veya daha fazla ardasık boşluk karekterini ifade eder
        System.out.println(last);
        System.out.println(""+first+last);

    }
}
