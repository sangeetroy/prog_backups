class CI
{
public static void main (double p,double r,double t)
{
double ci=0;
ci=p*Math.pow(((1+r)/100),t);
System.out.println(ci);
}
}
