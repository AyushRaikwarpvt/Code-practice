package OOPs.Rivsion;

public interface Animal {
    public void Sound();
    public void Legs();
    public void WhatEating();
    public default void Sleping(){
        System.out.println("This Animal Are Sleeping");
    }
}
class Cow implements Animal{

    @Override
    public void Sound() {
        System.out.println("Cow Are Hehhhhh");

    }

    @Override
    public void Legs() {
        System.out.println("Cow Have four Legs");
    }

    @Override
    public void WhatEating() {
        System.out.println("Cow Are Eating Grass");
    }


}