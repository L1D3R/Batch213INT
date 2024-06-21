package d6if_switch_ternary;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("gün isimi veriniz:");
        String gunIsmi= input.next();
        //equals() iki string in birbirini aynısı olup olmadığını kontrol eder.
        //bu method boolean return eder (true ve false )
        boolean haftasonu =gunIsmi.equalsIgnoreCase("Cumartesi")||gunIsmi.equalsIgnoreCase("Pazar");
        if (haftasonu) {
            System.out.println("hafta sonu");
        } else if (gunIsmi.equalsIgnoreCase("pazartesi")||gunIsmi.equalsIgnoreCase("salı")||
                gunIsmi.equalsIgnoreCase("çarşamba")||
                gunIsmi.equalsIgnoreCase("perşembe") ||gunIsmi.equalsIgnoreCase("cuma")) {
            System.out.println("hafta içi");
        }else {
            System.out.println("geçerli bir gün ismi giriniz .");
        }


    }
}
