package Model;

public class Drob
{
    //1-объявить поля класса
    private int a;//числитель
    private int b;//знаменатель
    //2-создать конструктор

    public Drob(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //3-get и set

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public void print()
    {
        System.out.println(a+"/"+b);
    }
    public Drob Add(Drob d)
    {
        int ch=this.a*d.b+d.a*this.b;
        int znam=this.b*d.b;
        if(ch>znam) return new Drob(ch/gcd(ch,znam),znam/gcd(ch,znam));
        return new Drob(ch,znam);
    }
    public Drob Add(int z)
    {
        Drob d=new Drob(z,1);
        int ch=this.a*d.b+d.a*this.b;
        int znam=this.b*d.b;
        if(ch>znam) return new Drob(ch/gcd(ch,znam),znam/gcd(ch,znam));
        return new Drob(ch,znam);
    }
    public Drob Sub(Drob d)
    {
        int ch=this.a*d.b-d.a*this.b;
        int znam=this.b*d.b;
        if(ch>znam) return new Drob(ch/gcd(ch,znam),znam/gcd(ch,znam));
        return new Drob(ch,znam);
    }
    public Drob Mult(Drob d)
    {
        int ch=this.a*d.a;
        int znam=this.b*d.b;
        if(ch>znam) return new Drob(ch/gcd(ch,znam),znam/gcd(ch,znam));
        return new Drob(ch,znam);
    }
    public Drob Div(Drob d)
    {
        int ch=this.a*d.b;
        int znam=this.b*d.a;
        if(ch>znam) return new Drob(ch/gcd(ch,znam),znam/gcd(ch,znam));
        return new Drob(ch,znam);
    }
    private int gcd(int a,int b)
    {
        while (b!=0)
        {
            int tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
}
