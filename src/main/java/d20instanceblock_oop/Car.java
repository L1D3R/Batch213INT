package d20instanceblock_oop;

public class Car extends Vehicle{
    public String model="accord";
    public int year=2024;

    public Car(){
        this( "sport");
        System.out.println("sedan");
    }
    public Car(String tip){
        super();
        System.out.println( "sport");
    }
}
