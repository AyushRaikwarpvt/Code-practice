package OOPs.Rivsion;

public class Poli {
    int add(int a , int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Poli obj1 = new Poli();
        System.out.println(obj1.add(1,4));
        System.out.println(obj1.add(1.4,3.5));
    }
}
class Dog{
    public void Sound(){
        System.out.println("Boqw Boow");
    }
}
class Goldenritriver extends Dog{
    public void Sound(){
        System.out.println("Boqw Boow");
    }

    public static void main(String[] args) {
        Dog Pitbul = new Dog();
        Goldenritriver goldenritriver = new Goldenritriver();

        Pitbul.Sound();

    }
}
