

public class triangle
{
   public static void main(int a,int b,int c)
   {
       if (a==b && a==c && b==c)
       {
           System.out.println("Equilateral triangle");
        }
        else
        if ( a==b || a==c || b==c)
        {
            System.out.println("Isosceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
}