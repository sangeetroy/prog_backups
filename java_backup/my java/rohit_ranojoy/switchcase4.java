public class switchcase4
{
    public static void main(int a,int p,int r,int t)
    {
        System.out.println("press 1 for simple interest");
        System.out.println("press 2 for compound interest");
        switch(a)
        {
            case 1:double si=p*r*t/100;
                   System.out.println("simple interest is"+si);
                   break;
            case 2:int ci=p*(int)Math.pow((1+r/100),t);
                   System.out.println("compound interest is"+ci);
                   break;
            default:System.out.println("wrong choice");
                    break;
                }
            }
        }
        