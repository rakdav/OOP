import Model.Figure;

public class StaticClassAndMethod {
    public static void main(String[] args) {
        double x=Math.sqrt(4);
        System.out.println(Figure.Area(4,5));
        System.out.println(Figure.Perimetr(4,5));
        System.out.println(Figure.Area(5));
        System.out.println(Figure.Perimetr(7));
    }
}
