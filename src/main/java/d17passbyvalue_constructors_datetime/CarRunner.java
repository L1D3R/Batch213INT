package d17passbyvalue_constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {
        // car clasında obje üretelim
        Car c1=new Car("Bmw","3.29",2024,false);
       Car c3=new Car("dasda","şahin");
        System.out.println(c1.brand);
        System.out.println(c1.hybrid);
        System.out.println(c1.model);
        System.out.println(c1.year);
        c1.hareket();
        c1.dur();
        Car c2=new Car("merso","a2",2023,false);
        System.out.println(c2); // eğer bunları görebiliyorsak toString methodu sayaseinde
        System.out.println(c1); // objeye ulaşmak için car clası içinde tanımladığımız toString sayesinde
        System.out.println(c3);
    }
}
