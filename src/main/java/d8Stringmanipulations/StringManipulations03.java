package d8Stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        Scanner ınput =new Scanner(System.in);
        System.out.println("lütfen şifrenizi giriniz");
        String npm=ınput.nextLine();
        // en az 8 karekter olsun
         boolean lengControl=npm .length()>7;
        //System.out.println("lengControl= " + lengControl);
       boolean spaceControl= npm.replaceAll("[^ ]","").length()==0; //.isEmpty
       // System.out.println("uppercaseCoontrol=" + uppercaseControl);
        boolean uppercaseControl=npm.replaceAll("[^A-Z]","").length()>0 ;
        boolean lowercaseControl=npm.replaceAll("[^a-z]","").length()>0 ;
        //System.out.println("lowercaseCoontrol=" + lowercaseControl);
        boolean digitControl=npm.replaceAll("[^0-9]","").length()>0 ;

        boolean sembolcaseControl=npm.replaceAll("[^!@#$%^&*()]","").length()>0 ;
        //System.out.println("sembolcaseCoontrol=" + sembolcaseControl);

        boolean isvalid= lengControl &&spaceControl&& lowercaseControl&& sembolcaseControl &&uppercaseControl ;
        if (isvalid){
            System.out.println("şifre geçerlidir");
        }else
            System.out.println("şifre geçersizdir ");





    }
}
