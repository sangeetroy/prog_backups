//Area of circle,rectangle,triangle depending upon users choise.
import java.util.Scanner;
public class Area
{
    public static double circleArea(double r)
    {
        double area=3.14159*r*r;
        return area;
    }
    public static double rectangleArea(double l,double b)
    {
        double area=l*b;
        return area;
    }
    public static double triangleArea(double a,double b,double c)
    {
        double s=0,area;
        //s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("Enter your choice(1/2/3)...");
        int ch=inp.nextInt();
        String chosen="";
        double area=0;
        switch(ch)
        {
            case 1: area=circleArea(3.2);
            chosen="Circle";
            break;
            case 2: area=rectangleArea(3.2,4.3);
            chosen="rectangle";
            break;
            case 3: area=triangleArea(3.2,4.3,5.2);
            chosen="triangle";
            break;
            default: System.out.println("Wrong choise!!");
            break;
        }
        System.out.println("The area of"+chosen+"is"+area);
    }
}
        
