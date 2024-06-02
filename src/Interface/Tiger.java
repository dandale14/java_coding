package Interface;

public class Tiger implements Animal{

    @Override
    public void sound() {
        System.out.println("tiger sound");
    }

    @Override
    public void colour() {
        System.out.println("tiger colour");
    }
}
