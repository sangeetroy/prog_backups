import java.io.*;
class student
{
    String name;
    int roll,mark1,mark2,t,grade;
    char g;
   
   
        student(String n,int r,int m,int m1)
        {
           name=n;
           roll=r;
           mark1=m;
           mark2=m1;
           System.out.println("enter name"+n);
           System.out.println("enter roll"+r);
           System.out.println("enter marks1"+m);
           System.out.println("enter marks2"+m1);
        }
        void total()
        {

            t=mark1+mark2;
            System.out.print("total"+t);
        }
        void gradecal()
        {
            
            if(t<90)
            g='f';
            else
            if(t<120)
            g='p';
            else
            if(t<190)
            g='g';
            else
            if(t>=190)
            g='s';
            System.out.println("grade"+g);
        }
        void display()
        {
            System.out.println("name"+name);
            System.out.println("roll"+roll);
            System.out.println("marks1"+mark1);
            System.out.println("marks2"+mark2);
            System.out.println("total"+t);
            System.out.println("grade"+g);
        }
        public static void main()throws IOException
        {
            int i,r,m,m1;
            String n;
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            for(i=1;i<=2;i++)
            {
                n=br.readLine();
                r=Integer.parseInt(br.readLine());
                m=Integer.parseInt(br.readLine());
                m1=Integer.parseInt(br.readLine());
                student s1=new student(n,r,m,m1);
                s1.total();
                s1.gradecal();
                s1.display();
            }
        }
    }
                
                









