package d10loops;

public class ForLoops01 {
    public static void main(String[] args) {

        //charAt() methoduna index verince size karakteri getirir
        //break anahtar kelimesi, bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır.
       // String s="Tramvay";


        /*for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a') {
                break;
            }
            System.out.print(ch); //Tr
        }
        for (int i = 0 ;i < s.length()  ; i++){
            char ch=s.charAt(i);

            if (ch == 'a'){
                break;
            }
            System.out.print(ch);*/




           /* String s1="Pwd12?Ab";
            for (int a=0; a <s1.length(); a++){
                char cs=s1.charAt(a);
                if (cs>='a' && cs<='b' ){
                    continue; // işlem yapma döngüye devam et geri kalan kolonları yurutme artırma azaltmaya git
                }else {
                    System.out.print(cs);
                }


                //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz.Interview Sorusu
                //           String t = "Ali Can";  ==> “naC ilA”

                //Loop olustururken baslangic ve bitis degeri cok onemlidir
                //son index her zaman length()-1'tir*/
                String t="Müslüm Baran";
                String tersi="";

                for (int i=t.length()-1;i>=0 ;i--){
                    tersi=tersi+t.charAt(i);

                }
                System.out.println(tersi);

            }

        }



