public class switchcase2
{
    public static void main(int x,int a,int b)
    {
        System.out.println("press 1 for leap year checking");
        System.out.println("press 2 for positive no.OR negative no.checking");
        switch(x)
        {
            case 1:if(a%4==0||a%400==0)
                   System.out.println("leap year");
                   else
                   System.out.println("not a leap year");
                   break;
            case 2:if(b>0)
                   System.out.println("a positive no.");
                   if(b<0)
                   System.out.println("a negative no.");
                   break;
            default:System.out.println("wrong choice");
                    break;
                }
            }
        }
        
        