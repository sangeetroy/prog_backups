import java.io.*;
class IscScore
{
    BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
    int number[][]=new int [6][2];int i,j;
    IscScore()
    {
        for(i=0;i<6;i++)
        {
            for(j=0;j<2;j++)
            number[i][j]=0;
        }
    }
    void InputMarks()throws IOException
    {
        for(i=0;i<6;i++)
        {
            System.out.println("ENTER SUBJECT CODE");
            number[i][0]=Integer.parseInt(br.readLine());
            System.out.println("ENTER SUBJECT MARKS");
            number[i][1]=Integer.parseInt(br.readLine());
        }
    }
    int point(int x)
    {
        if(x>=90)
        return 1;
        if(x>=80 && x<=89)
        return 2;
        if(x>=70 && x<=79)
        return 3;
        if(x>=60 && x<=69)
        return 4;
        if(x>=50 && x<=59)
        return 5;
        if(x>=40 && x<=49)
        return 6;
        if(x>=30 && x<=39)
        return 7;
        if(x>=20 && x<=29)
        return 8;
        if(x>=10 && x<=19)
        return 9;
        else
        return 10;
    }
}

