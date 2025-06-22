package OOPs.Rivsion;

public abstract class Hundai {

    abstract  public void Sound();
    abstract public void Fuiling();
    public void Run_HudaiMoters(){
        System.out.println("Start The HUndai Motres");
    }
}

class Aura extends Hundai{

    @Override
    public void Sound() {
        System.out.println("Bhoom Bhoom This Is Aura");
    }

    @Override
    public void Fuiling() {
        System.out.println("Fuiling With CNG");
    }

    public static void main(String[] args) {

        Aura obj = new Aura();
        obj.Run_HudaiMoters();
        obj.Sound();
        obj.Fuiling();

    }


}