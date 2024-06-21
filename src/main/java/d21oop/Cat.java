package d21oop;

public class Cat extends Mammal {
    public void meow(){
        System.out.println("cats meow");

    }

    @Override
    public void feedWithMilk(){
        System.out.println("Mammals feed their babies with milk");
    }
}

