package Inheritance;
import java.util.*;
class Student2
{
    String name="";
    int roll;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a name ");
        name=sc.nextLine();
        System.out.print("Enter your roll no ");
        roll=sc.nextInt();
    }
    void show()
    {
        System.out.println("Name of student :- "+name);
        System.out.println("Roll no :- "+roll);
    }
}