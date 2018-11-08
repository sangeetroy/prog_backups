import java.util.*;
class Point
{
    int x;
    int y;
    Point()
    {
        x=0;
        y=0;
    }
    void readPoint()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the x co=ordinates ");
        x=sc.nextInt();
        System.out.print("Enter the y co=ordinates ");
        y=sc.nextInt();
    }
    void display()
    {
        System.out.println("The x co-ordinates are "+x);
        System.out.println("The y co-ordinates are "+y);
    }
    Point midpoint(Point A,Point B)
    {
        Point c=new Point();
        c.x=(A.x+B.x)/2;
        c.y=(A.y+B.y)/2;
        return c;
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        Point A=new Point();
        Point B=new Point();
        A.readPoint();
        A.display();
        B.readPoint();
        B.display();
        Point res=new Point();
        Point p=new Point();
        p=res.midpoint(A,B);
        p.display();
    }
}