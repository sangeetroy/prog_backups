public class switchcase1
{
    public static void main(int a,int b,int c)
    {
        int d;
        System.out.println("press 1 for adding 2 numbers");
        System.out.println("press 2 for subtracting 2 numbers");
        System.out.println("press 3 for multiplying 2 numbers");
        System.out.println("press 4 for dividing 2 numbers");
        switch(a)
        {
            case 1:d=b+c;
                  System.out.println("sum is"+d);
                  break;
            case 2:d=b-c;
                  System.out.println("subtraction is"+d);
                  break;
            case 3:d=b*c;
                  System.out.println("product is"+d);
                  break;
            case 4:d=b/c;
                  System.out.println("division is"+d);
                  break;
                }
            }
        }
        