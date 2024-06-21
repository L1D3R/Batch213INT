package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {
           // Motor m =new Motor(); //interdacelerden object uretemezsiniz
            AudiA4 a4=new AudiA4();
            a4.analog();
            a4.esp();
            a4.analog();
        ((Motor)a4).run();
        //motor interface inden gelen run () methodu çalıştı
       // Motor.fiyat=5000; // finalin ispatı yeni değer atayamayız
        System.out.println(Motor.fiyat);
        System.out.println(Klima.fiyat);
        System.out.println(Fren.fiyat);
            Motor.hız();
            a4.guc();





    }
}
