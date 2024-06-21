package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
        Scanner ınput=new Scanner(System.in);
        System.out.println("lütfen yaşnız giriniz");
        int num=ınput.nextInt();
        if (num<0) {
            System.out.println("geçerli bir yaş giriniz");
        } else if (num>=0 && num<=4) {
            System.out.println("bebeksin daha");
        } else if (num>=5 && num<=12) {
            System.out.println("çoçuksun daha");
        } else if (num>=13 && num<=20) {
            System.out.println("gençsin daha");
        } else if (num>=21 && num <=30) {
            System.out.println("yetişkin sin");
        } else {
            System.out.println("tamamladınız yaşlınız0");
        }

    }
}
