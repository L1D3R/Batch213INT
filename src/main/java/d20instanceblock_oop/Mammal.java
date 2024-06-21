package d20instanceblock_oop;

public abstract class Mammal extends Animal {
    public void feedWithMilk(){
        System.out.println("Mammals feed their babies with milk");

    }

    public abstract Animal create();

    public abstract int add(int a, int b);
}
