package d22oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student s=new Student();
        //-------get----------
        System.out.println("s.getAge() = " + s.getAge());

        System.out.println("s.isSuccesful() = " + s.isSuccesful());
        //----------set--------

        s.setAge(23);
        s.setSuccesful(false);
        System.out.println(s.getAge()+  " "+   s.isSuccesful());

        //set ile verileri değiştirebiliriz constructor larda da değiştirebiliyoruz. farkı nedir
        //set ==> mevcut bir nesnenin verilerini değiştirmek için kullanılır
        //  constructor ==> yeni nesnelerin başlangıç durumu belirlemek için kullanılır
         // arştırma ödevi encaplation da private ile gizlenen bir veri başka package dan set method ile
        // değiştirilebilir mi?
        // get ve set metodlarına sahip classlar sıkca java beans olarak adlandırılır.


        // kaliptan istediğimiz kadar böyle oluşturabiliriz.
        // memory problemi onler birçok object memoryi doldurdu.

    }
}
