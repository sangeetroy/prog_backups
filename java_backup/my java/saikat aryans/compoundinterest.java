import java.io.*;
public class compoundinterest
{
    public static void main(int P,int r,int T)
    {
        int CI;
        CI=P*(int)Math.pow((1+r/100),T);
        System.out.println (CI);
    }
}

        