package d21oop;

import d20instanceblock_oop.Animal;
import d20instanceblock_oop.Mammal;

public class Dog extends Mammal {
    public void bark() {

        System.out.println("dogs bark...");
    }


  @Override
    public void eat() {
        System.out.println("dantel eat");
    }
    @Override
    public Animal create(){
        return new Dog();
    }
    @Override
    public  int add(int a,int b ){
        return a+b;
    }
}
