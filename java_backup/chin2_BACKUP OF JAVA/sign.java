import java.io.*;



public class sign 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sign abc = new sign();
        String name , password , confirm , name1 , passwrd, name2; 
        int ch1 , choice , m = 0;
        char cont;
        System.out.println("                      PRESS");
        System.out.println("1  TO SIGN UP                         2 TO SIGN IN");
        System.out.println();
        System.out.println("                ENTER YOUR CHOICE::");
        int ch = Integer.parseInt(br.readLine());
        System.out.println();
        if(ch == 2)
        {
                System.out.println("CREATE   USERNAME::");
                name = br.readLine();
                System.out.println("CREATE   PASSWORD::");
                password = br.readLine();
                do
                {
                    if(m>0)
                    {
                        System.out.println("YOU HAVE ENTERED WRONG PASSWORD::");
                        abc.delay();
                    }
                    System.out.println("RE - ENTER THE PASSWORD FOR CONFIRMATION::");
                    confirm = br.readLine();
                    m++;
                }while(password.equals(confirm)==false);
                System.out.println("DONE  THEN  PRESS 1::");
                System.out.println("OR  PRESS  2  TO 'EXIT'::");
                System.out.println("ENTER  YOUR  CHOICE::");
                ch1 = Integer.parseInt(br.readLine());
                m = 0;
                if(ch1 == 1)
                {
                    do
                    {
                        if(m>0)
                        {
                            System.out.println("YOU HAVE ENTERED WRONG USERNAME::");
                            abc.delay(); 
                        }
                        System.out.println("ENTER   USERNAME::");
                        name2 = br.readLine();
                        m++;
                    }while(name.equals(name2)==false);
                    m = 0;
                    do
                    {
                        if(m>0)
                        {
                            System.out.println("YOU HAVE ENTERED WRONG PASSWORD::");
                            abc.delay();
                        }
                        System.out.println("ENTER   PASSWORD::");
                        passwrd = br.readLine();
                        m++;
                    }while(passwrd.equals(password)==false);
                    m = 0;
                    System.out.println("PRESS  1  TO  CONFIRM");
                    System.out.println("PRESS  2  TO  EXIT");
                    System.out.println("ENTER  YOUR  CHOICE");
                    choice = Integer.parseInt(br.readLine());
                    if(choice == 1)
                    {
                        System.out.println("                                GO");
                        abc.delay();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("                                                                        ********  ***  ***      ***      ***    **   **  ***  **      **     ****     **    **");
                        System.out.println("                                                                           **     **    **     ** **     ** *   **   ** **     **    **    **    **   **    **");
                        System.out.println("                                                                           **     ********    *******    **  *  **   ****        *  *      **    **   **    **");
                        System.out.println("                                                                           **     **    **   **     **   **   * **   ** **        **       **    **   **    **");
                        System.out.println("                                                                           **     ***  ***  **       **  **    ***   **  ***      **         ****      ******");
                    }
                    else if(choice == 2)
                    {
                        System.out.println("THANK YOU");
                    }
                    else 
                    {
                        System.out.println(" THE PROGRAM HAS TERMINATED BECAUSE OF WRONG CHOICE::");
                    }
                }
                else
                {
                    System.out.println("THE PROGRAM HAS TERMINATED");
                }   
            }
            else if(ch == 1)
            {
                System.out.println("ENTER   USERNAME::");
                name1 = br.readLine();
                System.out.println("ENTER   PASSWORD::");
                passwrd = br.readLine();
                do
                {
                    if(m>0)
                    {
                        System.out.println("YOU HAVE ENTERED WRONG PASSWORD::");
                        abc.delay();
                    }
                    System.out.println("RE - ENTER THE PASSWORD FOR CONFIRMATION::");
                    confirm = br.readLine();
                    m++;
                }while(passwrd.equals(confirm)==false);
                System.out.println("PRESS  1  TO  CONFIRM");
                System.out.println("PRESS  2  TO  EXIT");
                System.out.println("ENTER  YOUR  CHOICE");
                choice = Integer.parseInt(br.readLine());
                m = 0;
                if(choice == 1)
                {
                    System.out.println("                                GO");
                    abc.delay();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("                                                                        ********  ***  ***      ***      ***    **   **  ***  **      **     ****     **    **");
                    System.out.println("                                                                           **     **    **     ** **     ** *   **   ** **     **    **    **    **   **    **");
                    System.out.println("                                                                           **     ********    *******    **  *  **   ****        *  *      **    **   **    **");
                    System.out.println("                                                                           **     **    **   **     **   **   * **   ** **        **       **    **   **    **");
                    System.out.println("                                                                           **     ***  ***  **       **  **    ***   **  ***      **         ****      ******");
                }
                else if(choice == 2)
                {
                        System.out.println("THANK YOU");
                }
                else
                {
                    System.out.println(" THE PROGRAM HAS TERMINATED BECAUSE OF WRONG CHOICE::");
                }
            }   
            else
            {
                System.out.println(" THE PROGRAM HAS TERMINATED BECAUSE OF WRONG CHOICE::");
            }
        }
    public void delay()
    {
          for(long i1 = 1;i1<=2147483647;i1++)
          {}
          System.out.print("\f");
    }
}
