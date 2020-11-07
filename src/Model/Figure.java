package Model;

public class Figure
{
//    private static final double Pi=3.14; //1-способ
    private static final double Pi;//2-способ
    static {
        Pi=3.14;
    }
    private Figure() {
    }

    public static double Area(double width, double height)
    {
        return width*height;
    }
    public static double Perimetr(double width,double height)
    {
        return 2*(width+height);
    }
    public  static double Area(double R)
    {
        return Pi*R*R;
    }
    public static double Perimetr(double R)
    {
        return 2*Pi*R;
    }
}
