

class series
{
   public static void main()
   {
      int i,j;
       for(i=1;i<=5;i++)
      {
          if(i==1||i==5)
           for(j=1;j<=5;j++)
             System.out.print(j+" ");
          else
          {
              for(j=1;j<=(i-1);j++)
                System.out.print(j+" ");
              for(j=1;j<=(5-i);j++)
                System.out.print("*"+" ");
              System.out.print("5");
            }
            System.out.println("");
    }
}
}
