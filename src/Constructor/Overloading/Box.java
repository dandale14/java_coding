package Constructor.Overloading;

public class Box {
    double lenght,width,depth;
    int boxNo;

    Box(double L , double W ,double D ,int BoxNo ,int N)
    {

        lenght=L;
        width=W;
        depth= D;
        BoxNo=N;
    }
Box()
{
    width=depth=lenght=0;

}
Box(int boxNo)
{
    this();
    boxNo=boxNo;

}
}
