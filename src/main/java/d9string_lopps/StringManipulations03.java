package d9string_lopps;

public class StringManipulations03 {
    public static void main(String[] args) {

        // isEmpty(); metodu sadace hiçliği kontrol eder true verir
        //isBlank (); methodu ise hem hiçliği hemde space de kontrol eder .true verir

        String pasword = "a ";
        boolean first = pasword.isEmpty();  // isEmpty(); metodu sadace hiçliği kontrol eder true verir
        System.out.println(first);

        boolean second = pasword.isBlank();  //isBlank (); methodu ise hem hiçliği hemde space de kontrol eder .true verir
        System.out.println(second);

        boolean trod = pasword.trim().equals(pasword);
        System.out.println(trod);

        if (first) {
            System.out.println("parola hiç bir şey yazılmadan gicilmez");
        }
        if (second) {
            System.out.println("parola boş bırakılmamalı ve boşluk harici karakterlerde bulunmalıdır");
        }
        if (!trod) {
            System.out.println("parolanın başına ve sonuna boşluk bırakılmamalıdır ");
        }


    }
}
