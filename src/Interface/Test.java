package Interface;

public class Test
{
    public static void main(String[] args) {
        Cat c = new Dog();
        c.sound();
        c.colour();
        Animal a = new Tiger();
        a.colour();
        a.sound();
    }
}
