class Telephone
{
    public static void main(int u)
    {double c=0;
        if(u<=75)
        c=0;
        
        else
        if(u<=150)
        c=0+((u-75)*0.50);
        
        else
        if(u<=225)
        c=0+(75*0.50)+((u-150)*1);
        
        else 
        if(u<=300)
        c=0+(75*0.50)+(150*1)+((u-225)*2.50);
        
        else
        if(u>300)
        c=0+(75*0.50)+(150*1)+(225*2.50)+((u-300)*3.50);
        
        System.out.println("Bill" +c);
    }
}