public class digits
{
    public static void main(int n)
    {
        int a=0;
        while(n>0)
        {
          int k=n%10;
            if(k==0)
            System.out.println("zero");
            if(k==1)
            System.out.println("one");
            if(k==2)
            System.out.println("two");
            if(k==3)
            System.out.println("three");
            if(k==4)
            System.out.println("four");
            if(k==5)
            System.out.println("five");
            if(k==6)
            System.out.println("six");
            if(k==7)
            System.out.println("seven");
            if(k==8)
            System.out.println("eight");
            if(k==9)
            System.out.println("nine");
            n=n/10;
        }
    }
}
            
            