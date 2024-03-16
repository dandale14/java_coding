public class Karvenager {

    int pin;
    float area;
    String landmark;
    public Karvenager (int pin ,float area,String landmark)
    {
       this.pin = pin;
       this.area=area;
       this.landmark = landmark;

    }
    public static void main (String []args)
    {
        Karvenager k = new Karvenager (123,12.5f,"Karvenager road");

        System.out.println("pin " + k.pin);
        System.out.println("Area " + k.area);
        System.out.println("Landmark " + k.landmark);

    }

}
