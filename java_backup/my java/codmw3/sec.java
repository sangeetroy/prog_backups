import java.util.*;
public class sec extends inherit
{
    int m1,m2,m3;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.println("Enter marks 1");
        m1=sc.nextInt();
        System.out.println("Enter marks 2");
        m2=sc.nextInt();
        System.out.println("Enter marks 3");
        m3=sc.nextInt();
        super.display();
        display();
    }
    void display()
    {
        System.out.println(+m1);
        System.out.println(+m2);
        System.out.println(+m3);
    }
}