
import java.io.*;
class farhan
{
public int call;
public double bill;
public void Intake(int x)
{
call=x;
}
public void calc()
{
bill=(call<=75?0:call<=150?(call-75)*0.50:call<=225?(75*0.50)+(call-150)*0.75:call<=300?(75*0.50)+(75*0.75)+(call-225)*1.50:(75*0.50)+(75*0.75)+(75*1.50)+(call-300)*2.50);
}
public void display()
{
System.out.println("Telephone bill="+bill);
}
}


