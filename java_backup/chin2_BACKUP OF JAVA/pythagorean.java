import java.io.*;
public class pythagorean
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
        pythagorean abc = new pythagorean();
        System.out.println("ENTER THE FIRST NUMBER : ");
        int i1 = Integer.parseInt(br.readLine());
        System.out.println("ENTER THE SECOND NUMBER : ");
        int i2 = Integer.parseInt(br.readLine());
        System.out.println("ENTER THE THIRD NUMBER : ");
        int i3 = Integer.parseInt(br.readLine());
        int sum = i1+i2+i3;
        int min = (i1<i2)?(i1<i3)?i1:i3:(i2<i3)?i2:i3;
        int max = (i1>i2)?(i1>i3)?i1:i3:(i2>i3)?i2:i3;
        int mid = sum - (min+max);
        int s = mi+ in 
        if(((min*min)+(mid*mid)) == (max*max))
        {
            System.out.println("THE NUMBERS ENTERED FORM A PYTHAGOREAN TRIPLET");
        }
        else
        {
            System.out.println("THE NUMBERS ENTERED DO NOT FORM A PYTHAGOREAN TRIPLET");
        }
        abc.thankyou();
    }
}
