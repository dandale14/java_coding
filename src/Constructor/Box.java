package Constructor;

public class Box {

    double height;
    double width;
    double depth;

    public Box(double h,double w ,double d)
    {
        height = h;
        width = w;
        depth = d;
    }
     public double volume ()
     {
        return  height*width*depth;
     }
}
