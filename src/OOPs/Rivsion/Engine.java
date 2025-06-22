package OOPs.Rivsion;




//This is Simgle level Inharitance
//Heirechy Level
//Muiltilevel

import MuiltiThread.Sample;

public class Engine {

    String Engine_Type;
    int Engine_Model;
    String Engine_Name;

    public void RunEngine(){
        System.out.println("Engine Was Start");
    }

    public static void main(String[] args) {

        TaTa Harrier = new TaTa();
        Harrier.Car_Name = "Tata Harrier TOP";
        Harrier.car_Number =  1223;
        Harrier.Tata_IsOn();
        Harrier.RunEngine();

        System.out.println("----------------------------------------------");

        Sizuki Swift = new Sizuki();
        Swift.Car_name = "sizuki Swift";
        Swift.Car_Number = 1344;
        Swift.Sizuki_IsOn();
        Swift.RunEngine();

        System.out.println("----------------------------------------------");

        Hondai Aura = new Hondai();
        Aura.Car_name = "Hundai Auara";
        Aura.Car_Number = 14554;
        Aura.Hondai_IsOn();;
        Aura.RunEngine();
        System.out.println("----------------------------------------------");

        safari safari = new safari();
        safari.RunEngine();
        safari.Tatasafari_Ison();

    }
}
class TaTa extends Engine {
    String Car_Name;
    int car_Number ;

    public  void Tata_IsOn(){
        System.out.println("Tata was On With " + Car_Name + "car Number Is" + car_Number);
    }

}

class Sizuki extends Engine{
    String Car_name;
    int Car_Number;

    public  void Sizuki_IsOn(){
        System.out.println("Sizuki was On With " + Car_name + "car Number Is" + Car_Number);
    }

}

class Hondai extends Engine{

    String Car_name;
    int Car_Number;

    public  void Hondai_IsOn(){
        System.out.println("Hondai was On With " + Car_name + "car Number Is" + Car_Number);
    }

}
class safari extends TaTa{
    String Car_Name = "Tata Safari";
    int Car_number = 1454;
    public void Tatasafari_Ison(){
        System.out.println("My Tata safari Was On");
    }
}