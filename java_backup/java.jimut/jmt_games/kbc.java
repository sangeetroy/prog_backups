import java.io.*;

public class kbc
{
    
    public static void main(String args[]) throws IOException
    {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         kbc abc = new kbc();
         for(int i = 5;i>=1;i--)
         {
             System.out.println(i+" SECONDS REMAINING");
             for(long i1 = 1;i1<=2000000000;i1++)
             {}
             for(long i1 = 1;i1<=2000000000;i1++)
             {}
             System.out.print("\f");
         }
        System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
        System.out.println();
        
        System.out.println("                                   |||||             |||||           ||||||||||||||||            ||||                         |||||||||                 |||||||||||||             |||||||||       ||||||||||           |||||||||||||||||");
        
        System.out.println("                                   |||||             |||||           |||||                       ||||                      ||||        ||||           ||||         ||||           |||||    ||    ||    |||||           |||||       ");
       
        System.out.println("                                   |||||             |||||           |||||                       ||||                     ||||                        ||||         ||||           |||||     ||||||     |||||           |||||       ");
       
        System.out.println("                                   |||||     |||     |||||           ||||||||||||                ||||                    ||||                         ||||         ||||           |||||      ||||      |||||           ||||||||||||  ");
       
        System.out.println("                                   |||||   ||| |||   |||||           |||||                       ||||                     ||||                        ||||         ||||           |||||                |||||           |||||       ");
       
        System.out.println("                                   ||||||||       ||||||||           |||||                       ||||                      ||||        ||||           ||||         ||||           |||||                |||||           |||||       ");
        
        System.out.println("                                   ||||||           ||||||           ||||||||||||||||            ||||||||||||||||              |||||||||                |||||||||||||             |||||                |||||           |||||||||||||||||");
        for(int i = 1; i <= 3; i++)
         {
             abc.delay();
         }
        System.out.print("\f");  
         abc.line();
         System.out.println("                                                                                      ***    *****            ********               *******         ");
         System.out.println("                                                                                      ***   ***               ***   ****          ***                ");
         System.out.println("                                                                                      ***  **                 ***   ****          ***                ");
         System.out.println("                                                                                      ******                  *******             ***                ");
         System.out.println("                                                                                      ***  **                 ***   ****          ***                ");
         System.out.println("                                                                                      ***   ***        ***    ***   ****    ***    ***         ***  ");
         System.out.println("                                                                                      ***    *****     ***    ********      ***      *******   ***  ");
         abc.delayp();
         System.out.print("\f");
         abc.line();
         System.out.println("                                   **   **        ******      **********   ******    **********           ****       ********        **         ***     ***        ******    **   ****         **   **");
         System.out.println("                                   **   **        **   ***    **          **             **             **    **     **              **         ***     ***      **    **    **  **            **   **");
         System.out.println("                                   **   **        **   **     **          **             **            **      **    **              **         ***     ***     **           ** **             **   **");
         System.out.println("                                   **   **        *****       *******      *****         **            **      **    ******          **         ***     ***     **           ****              **   **");
         System.out.println("                                                  **   **     **               **        **            **      **    **              **         ***     ***     **           ** **                    ");
         System.out.println("                                   **   **        **   ***    **               **        **             **    **     **              **          **     **       **    **    **  **            **   **");
         System.out.println("                                   **   **        *******     **********  *******        **               ****       **              ********     *******          ******    **   *****        **   **");
         abc.delayp();
         System.out.print("\f");
         abc.questions();
         abc.delayp();
         System.out.println("\f");
         abc.line();
         System.out.println("                                                                        ********  ***  ***      ***      ***    **   **  ***  **      **     ****     **    **");
         System.out.println("                                                                           **     **    **     ** **     ** *   **   ** **     **    **    **    **   **    **");
         System.out.println("                                                                           **     ********    *******    **  *  **   ****        *  *      **    **   **    **");
         System.out.println("                                                                           **     **    **   **     **   **   * **   ** **        **       **    **   **    **");
         System.out.println("                                                                           **     ***  ***  **       **  **    ***   **  ***      **         ****      ******");
    }   
    public void delay()
    {
         for(long i1 = 1;i1<=2000000000;i1++)
         {}
    }
    public void delayp()
    {
        for(int i2 = 1; i2<= 3; i2++)
        {
                delay();
        }
    }
    public void line()
    {
        for(int i=1; i<=18 ; i++)
        {
            System.out.println();
        }
    }
    public void questions()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));String ques[] = new String [12];
        ques[0]  = "WHAT DOES A CRICKET UMPIRE SIGNAL BY EXTENDING ONE ARM HORIZONTALLY ?";
        ques[1]  = "WHICH OF THESE STATES WERE CARVED OUT OF UTTAR PRADESH ?";
        ques[2]  = "ACCORDING TO THE ZODIAC , THE BIRTH SIGN OF JESUS IS:";
        ques[3]  = "WHAT DOES AN EYE POWER OF 6/6 INDICATE ?";
        ques[4]  = "WHAT ARE SHADAJ , MADHYAM , PANCHAM , NISHAD NAMES OF ?";
        ques[5]  = "WHAT ARE JAGUAR , MIRAGE AND MiG NAMES OF ?";
        ques[6]  = "IN WHICH OF THESE SPORTS DOES A PLAYER NEED TO WIN AT LEAST 11 POINTS ?";
        ques[7]  = "WHO WAS THE LAST JAIN TIRTHANKARA ?";
        ques[8]  = "WHICH INDIAN UMPIRE TOOK MORE THAN 100 TEST WICKETS AS A BOWLER ?";
        ques[9]  = "HOW MANY CHARACTERS MADE UP OF DOTS ARE USED IN BRAILLE ?";
        ques[10] = "WHICH BABY IS OFFICIALLY CONSIDERED TO BE INDIA'S ONE BILLIONTH CHILD ?";
        ques[11] = "WHICH ACTOR CAPTAINED ENGLAND INHIS ONLY APPEREANCE IN TEST CRICKET ?";
        String A1[]   = {"LEG BYE","UTTARAKHAND","AQUARIS","TOTAL BLINDNESS","YOGASANAS","NUCLEAR MISSILES","TENNIS","PARSHVANATH","RAMBABU GUPTA","49","ASHA","WILLIAM HOLDEN"};
        String B1[]   = {"WIDE","CHHATTISGARH","CAPRICORN","PARTIAL BLINDNESS","MUSICAL SWARAS","SUBMARINES","NETBALL","MAHAVIRA","SWAROOP KRISHEN","63","ANOUSHKA","ALAN LADD"};
        String C1[]   = {"NO BALL","JHARKHAND","SAGITTARIUS","NORMAL EYESIGHT","DANCE MUDRAS","AIRCRAFTS","BASKETBALL","NEMINATH","S.VENKATARAGHAVA","75","AKANKSHA","C AUBREY SMITH"};
        String D1[]   = {"OUT","VIDARBHA","SCORPION","MYOPIA","MANGOES","ROCKET LAUNCHERS","TABLE TENNIS","RISHABHDEV","PILOO REPORTER","87","ASTHA","W C FIELDS"};
        String ans[]  = {"C","A","B","C","B","C","D","B","C","B","D","C"};
        String input,win = "0";
        boolean b = true;
        int o = 0;
        String ans1[]  = {"c","a","b","c","b","c","d","b","c","b","d","c"};
        String money[] = {"5,000" , "10,000" , "20,000" , "40,000" , "80,000" , "1,60,000" , "3,20,000" , "6,40,000" , "12,50,000" , "25,00,000" , "50,00,000" , "1 CRORE"};
        for(int i = 0; i<12 ; i++)
        {
            System.out.println("Q."+(i+1)+". FOR RUPEES       "+money[i]+"      IS HERE ON YOUR SCREEN :");
            delayp();
            System.out.println();
            System.out.println();
            System.out.println(ques[i]);
            System.out.println();
            System.out.println();
            System.out.println("A."+A1[i]);
            System.out.println();
            System.out.println("B."+B1[i]);
            System.out.println();
            System.out.println("C."+C1[i]);
            System.out.println();
            System.out.println("D."+D1[i]);
            System.out.println();
            System.out.println("TOUR ANSWER IS ::::");
            input = br.readLine();
            System.out.println("\f");
            if((input.equals(ans[i]))||(input.equals(ans1[i])))
            {
                win = money[i];
                if(i != 11)
                {
                    five(i);
                    next();
                }
            }
            else
            {
                lose();
                o = i - 1;
                b = false;
                break;
            }
        }
        if(b==true)
        {
            crorepati();
        }
        else
        {
            System.out.println("                                                                                          AMOUNT WON  ");
            five(o);
        }
    }
    public void crorepati()
    {
        line();
        System.out.println("                                                   *******    ********        *******      ********      ********   ********        ****      **********   ******");
        System.out.println("                                                  **          **     ***     **     **     **     ***    **         **     ***     **  **         **         **");
        System.out.println("                                                 **           **     ***    **       **    **     ***    **         **     ***    **    **        **         **");
        System.out.println("                                                 **           ********      **       **    ********      ******     ********     **********       **         **");
        System.out.println("                                                 **           **    **      **       **    **    **      **         **          ***      ***      **         **");
        System.out.println("                                                  **          **     **      **     **     **     **     **         **         ***        ***     **         **");
        System.out.println("                                                   *******    **      **      *******      **      **    ********   **        ***          ***    **       ******");
        delayp();
        delay();
        System.out.println("\f");
    }
    public void lose()
    {
        line();
        System.out.println("                                                                                      **              *******          *********       *********");
        System.out.println("                                                                                      **             **     **        **               **");
        System.out.println("                                                                                      **            **       **       **               **");
        System.out.println("                                                                                      **            **       **        ********        *******");
        System.out.println("                                                                                      **            **       **               **       **");
        System.out.println("                                                                                      **             **     **                **       **");
        System.out.println("                                                                                      *********       *******         **********       **********");
        delayp();
        System.out.println("\f");
    }
    public void next()
    {
        line();
        System.out.println("                                                                                      ***      **      *********     **          **    ***********");
        System.out.println("                                                                                      ** *     **      **              **      **           **");
        System.out.println("                                                                                      **  *    **      **                **  **             **");
        System.out.println("                                                                                      **   *   **      *******             **               **");
        System.out.println("                                                                                      **    *  **      **                **  **             **");
        System.out.println("                                                                                      **     * **      **              **      **           **");
        System.out.println("                                                                                      **      ***      **********    **          **         **");
        delayp();
        System.out.println("\f");
        System.out.println();
        System.out.println();
        System.out.println("\f");
    }
    public void five(int i)
    {
       line();
       if(i == -1)
       {
            System.out.println("                                                                                          ******");
            System.out.println("                                                                                       ***      ***");
            System.out.println("                                                                                       ***      ***");
            System.out.println("                                                                                       ***      ***");
            System.out.println("                                                                                       ***      ***");
            System.out.println("                                                                                       ***      ***");
            System.out.println("                                                                                          ******");
       }
       else if(i == 0)
       {
            System.out.println("                                                                                       *********            ******            ******            ******");
            System.out.println("                                                                                       **                ***      ***      ***      ***      ***      ***");
            System.out.println("                                                                                       **                ***      ***      ***      ***      ***      ***");
            System.out.println("                                                                                       ********          ***      ***      ***      ***      ***      ***");
            System.out.println("                                                                                             **          ***      ***      ***      ***      ***      ***");
            System.out.println("                                                                                             **   ***    ***      ***      ***      ***      ***      ***");
            System.out.println("                                                                                       ********    **       ******            ******            ******");
       }
       else if(i == 1) 
       {
           System.out.println("                                                                                       **           ******             ******            ******            ******");
           System.out.println("                                                                                     ****        ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                       **        ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                       **        ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                       **        ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                       **        ***      ***  ***  ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                    ********        ******      **     ******            ******            ******");
       } 
       else if(i == 2) 
       {
           System.out.println("                                                                                     *****            ******             ******            ******            ******");
           System.out.println("                                                                                   ***    **       ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                          **       ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                         **        ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                        **         ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                      ***          ***      ***  ***  ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                    ********          ******      **     ******            ******            ******");
       }
       else if(i == 3)
       { 
           System.out.println("                                                                                       ***        ******             ******            ******            ******");
           System.out.println("                                                                                     ** **     ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                   **   **     ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                  ********     ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                        **     ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                        **     ***      ***  ***  ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                        **        ******      **     ******            ******            ******");
       }
       else if(i == 4)
       {
           System.out.println("                                                                                     ******           ******             ******            ******            ******");
           System.out.println("                                                                                   ***    ***      ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                   ***    ***      ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                     ******        ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                   ***    ***      ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                   ***    ***      ***      ***  ***  ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                                     ******           ******      **     ******            ******            ******");
       }
       else if(i == 5)
       {
           System.out.println("                                                                    **                   *********           ******              ******            ******            ******");
           System.out.println("                                                                  ****                 **                ***      ***         ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                    **                **                 ***      ***         ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                    **                ** ******          ***      ***         ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                    **                ***      ***       ***      ***         ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                    **       ***      ***      ***       ***      ***    ***  ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                 ********     **         ******             ******        **     ******            ******            ******");
           delayp();
       }
       else if(i == 6)
       {
           System.out.println("                                                                   *******               ******         ******                ******            ******            ******");
           System.out.println("                                                                  *      ***           ***     **    ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                         ***                   **    ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                     ******                   **     ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                         ***                **       ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                  *      ***   ***       ***         ***      ***   ***    ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                   *******      **     ***********      ******       **       ******            ******            ******");
       }
       else if(i == 7)
       {        
           System.out.println("                                                                   *********              ***           ******             ******            ******            ******");
           System.out.println("                                                                 **                     ** **        ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                **                    **   **        ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                ** ******            ********        ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                ***      ***               **        ***      ***       ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                ***      ***    ***        **        ***      ***  ***  ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                   ******        **        **           ******      **     ******            ******            ******");
       }
       else if(i == 8)
       {
           System.out.println("                                                                  **          *****            *********         ******              ******            ******            ******");
           System.out.println("                                                                ****        ***    **          **             ***      ***        ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                  **               **          **             ***      ***        ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                  **              **           ********       ***      ***        ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                  **             **                   **      ***      ***        ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                  **          ***      ***            **      ***      ***   ***  ***      ***      ***      ***      ***      ***");
           System.out.println("                                                               ********     ********    **     *******           ******       **     ******            ******            ******");
       }
       else if(i == 9)
       {
           System.out.println("                                                                 *****      *********                 ******           ******                ******            ******            ******   ");
           System.out.println("                                                               ***    **    **                     ***      ***     ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                      **    **                     ***      ***     ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                     **     ********               ***      ***     ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                    **             **              ***      ***     ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                 ***               **     ***      ***      ***     ***      ***    ***   ***      ***      ***      ***      ***      ***");
           System.out.println("                                                               **********   ********       **         ******           ******        **      ******            ******            ******   ");
       }
       else if(i == 10)
       {
           System.out.println("                                                             *********       ******                ******           ******                ******            ******            ******");
           System.out.println("                                                             **           ***      ***          ***      ***     ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                             **           ***      ***          ***      ***     ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                             ********     ***      ***          ***      ***     ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                    **    ***      ***          ***      ***     ***      ***          ***      ***      ***      ***      ***      ***");
           System.out.println("                                                                    **    ***      ***    ***   ***      ***     ***      ***   ***    ***      ***      ***      ***      ***      ***");
           System.out.println("                                                             ********        ******        **      ******           ******       **       ******            ******            ******");
       }
       else
       {}
       delayp();
       delayp();
       System.out.println("\f");
    }
}
