public class multi
{
    public static void main(String args[])
    {
        String a = "56789012345678901";
        String b = "56789012345678901"; 
        int a1 = Integer.parseInt(a.substring(10,a.length()));
        int b1 = Integer.parseInt(b.substring(10,b.length()));
        long multi1 = a1*b1;
        int a2 = Integer.parseInt(a.substring(3,10));
        int b2 = Integer.parseInt(b.substring(3,10));
        long multi2 = a2*b2;
        int a3 = Integer.parseInt(a.substring(0,3));
        int b3 = Integer.parseInt(b.substring(0,3));
        long multi3 = a3*b3;
        String finalstring = Long.toString((long)((multi3*Math.pow(10,16))+(multi2*Math.pow(10,13))+multi1));
        System.out.println("THE MULTIPLIED VALUE IS ::  "+finalstring.substring(1,finalstring.length()));
        System.out.println("A  =  "+a);
        System.out.println("B  =  "+b);
    }
}
