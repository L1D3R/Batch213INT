package d20instanceblock_oop;

public class Honda extends Car{
    public String model="civic";
    public  int year=2023;
    public Honda (){
        System.out.println("super.model = " + super.model);
        System.out.println("this.year = " + this.year);
        System.out.println("civic");

    }
    //b
    public Honda(String model){
        super();
        System.out.println("accord");
    }

}
