package Inheritance;
import java.util.*;
class Marks1 extends Student1
{
    int m;
    int m1;
    int m2;
    int total;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Enter marks 1" );
        m=sc.nextInt();
        System.out.print("Enter marks 2 " );
        m1=sc.nextInt();
        System.out.print("Enter marks 3 " );
        m2=sc.nextInt();
        total=m1+m2+m;
    }
    void show()
    {
        super.show();
        System.out.print("Total marks "+total);
    }
}