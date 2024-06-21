package d22oop;

public class AudiA4 implements Motor,Klima,Fren {

     /*
    a) interface’leri parent yapmak icin ‘implements’ keyword’u child icinde kullanilir

    b) extends kullanilmaz cunku bu iki class arasinda kullanilir

    c) AudiA4 Class’i, Motor interface’i icindeki tum methodlari override etmek zorundadir.

    d) AudiA4 Class’i, Motor interface’i icindeki tum methodlari override etmek zorunda
    oldugundan method’larin bas kismina ‘override’ yazmak gerekmez bu yuzden yazmayiz.

    e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
    */
    //Motor interface'inden override edilenler

    public void eco(){
         System.out.println("audi a4 ekonomik motor kullamır");
    }
    public void turbo(){
        System.out.println("audi a4 turbo motor kullanır");
    }
    public void gas(){
        System.out.println("audi a4 benzinli motor kullanır");
    }
    public void analog(){
        System.out.println("audi a4 analog klima kullanır");
    }
    public void dijital(){
        System.out.println("audi a4 dijital klima kullanır");
    }
    public void abs(){
        System.out.println("audi a4 abs fren sistemi kullanır");
    }
    public void esp(){
        System.out.println("audi a4 esp fren sistemi kullanır");
    }


}
