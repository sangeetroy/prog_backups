import java.util.*;
public class student
{
    Scanner sc=new Scanner(System.in);
    String name,sec;
    int roll;
    void input2()
    {
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter roll");
        roll=sc.nextInt();
        System.out.println("Enter section");
        sec=sc.nextLine();
    }
    void display()
    {
        System.out.println(+roll);
        System.out.println(name);
        System.out.println(sec);
    }    
}