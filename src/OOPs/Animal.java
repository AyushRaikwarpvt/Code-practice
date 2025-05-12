package OOPs;

import java.sql.SQLOutput;
// Abstract methos statc methos default method Concrat method
public interface Animal {

    void sleep ();
    void Talking();
    static  void  Bimar(){
        System.out.println("Our Animal Are bimar");
    }

     default void TreatmentAnimal (){
         System.out.println("Proper Sleepung know");
    }
}
class Panda implements  Animal{

    @Override
    public void sleep() {
        System.out.println("kjechu....");
    }

    @Override
    public void Talking() {
        System.out.println("SomeThing.....");
    }
}



class  Test {

    public static void main(String[] args) {
//
//        Animal Panda = new Panda();
//
//        Panda.Talking();
//        Panda.sleep();
//        Panda.TreatmentAnimal();
//        Animal.Bimar();

    }
}


