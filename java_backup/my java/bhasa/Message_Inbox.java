import java.io.*;
class Message_Inbox
{
    String a[]=new String[5];
    String b[]=new String[2];
    int top=0;
    int top1=0;
    int c=0;
    int i;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void input()throws IOException
    {
        System.out.println("ENTER '1' TO ACCEPT MESSAGE");
        System.out.println("ENTER '2' TO DISPLAY INBOX");
        System.out.println("ENTER '3' TO DISPLAY TEMP. INBOX");
        System.out.println("ENTER '4' TO SHOW STATS");
        System.out.println("ENTER '5' TO EXIT");
        int ch=Integer.parseInt(br.readLine());
        if(ch==1)
        push();
        if(ch==2)
        disp1();
        if(ch==3)
        disp2();
        if(ch==4)
        disp_stats();
        if(ch==5)
        System.exit(0);
    }
    
    
    
    void push()throws IOException
    {
        if(top<4)
        {
            System.out.println("ENTER MESSAGE :-");
            a[top]=br.readLine();
            top++;
        }
        else
        if(top==4 && top1<1)
        {
            System.out.println("INBOX FULL , TRANSFERRING MESSAGE TO TEMP. INBOX");
            b[top1]=a[0];
            for(i=1;i<=top;i++)
            a[i-1]=a[i];
            top1++;
            top--;
        }
        else
        if(top==4 && top1==1)
        {
            System.out.println("ALL FULL , MESSAGE WILL BE DELETED FROM MEMORY");
            for(i=1;i<=top1;i++)
            b[i-1]=b[i];
            c++;
            top--;
        }
        input();
    }
    
    
    
    void disp1()throws IOException
    {
        System.out.println("INBOX :-");
        for(i=top;i>=0;i--)
        System.out.println(a[i]);
        input();
    }
    
    
    void disp2()throws IOException
    {
        System.out.println("TEMP. INBOX :-");
        for(i=top1;i>=0;i--)
        System.out.println(b[i]);
        input();
    }
    
    
    void disp_stats()throws IOException
    {
        System.out.println("USER HAS "+top+" MESSAGES IN INBOX AND "+top1+" MESSAGES IN TEMP. INBOX AND "+c+" MESSAGES HAVE BEEN DELETED FROM MEMORY");
        input();
    }
    
    
}