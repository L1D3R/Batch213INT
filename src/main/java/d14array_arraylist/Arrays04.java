package d14array_arraylist;
import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        // arraylerin esit olup olmadığı nasıl anlaşılır
        int[] a=new int[3];
        a[0]=2;
        a[1]=1;
        a[2]=3;
        int[] b=new int[3];
        b[0]=2;
        b[1]=1;
        b[2]=3;
        //iki arreyin aynı olablimesi için aynı index te aynı elamanların bulunması gerekir
        boolean result= Arrays.equals(a,b);
        System.out.println("result:" + result);

    }
}
