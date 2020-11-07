import Model.Person;

import java.util.Scanner;
import static java.lang.Math.*;

public class MainClass {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        int age=in.nextInt();
        Person person=new Person(name,(int)sqrt(age));
//        person.setAge(7);
//        person.setName("Vasia");
        System.out.println("Name:"+person.getName()+" Age:"+person.getAge());
        Person kolya=new Person();
        kolya.setName("Коля");
        kolya.setAge(12);
        System.out.println("Name:"+kolya.getName()+" Age:"+kolya.getAge());
        Person Masha=kolya;
        System.out.println("Name:"+Masha.getName()+" Age:"+Masha.getAge());
        Masha.setAge(18);
        System.out.println("Name:"+kolya.getName()+" Age:"+kolya.getAge());
        Person vania=new Person("Vania");
        System.out.println("Name:"+vania.getName()+" Age:"+vania.getAge());
        Person pasha=new Person(13);
        System.out.println("Name:"+pasha.getName()+" Age:"+pasha.getAge());
    }
}
