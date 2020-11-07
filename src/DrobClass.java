import Model.Drob;

import java.util.Scanner;

public class DrobClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        Drob drob1=new Drob(a,b);
        drob1.print();
        int c=in.nextInt();
        int d=in.nextInt();
        Drob drob2=new Drob(c,d);
        drob2.print();
        Drob drob3=drob1.Add(drob2);
        drob3.print();
        Drob drob4=drob1.Sub(drob2);
        drob4.print();
        Drob drob5=drob1.Mult(drob2);
        drob5.print();
        Drob drob6=drob1.Div(drob2);
        drob6.print();
        Drob drob7=drob6.Add(6);
        drob7.print();
    }
}
