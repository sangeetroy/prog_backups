import java.io.*;
class Creation_file
{
 public static void main(String args[]) throws IOException
 {
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        String Sent;
        FileWriter std=new FileWriter("data.txt");
        BufferedWriter mat=new BufferedWriter(std);
        PrintWriter obj=new PrintWriter(mat);
        System.out.print("Input Total Number Of Sentences To Store :");
        int N=Integer.parseInt(inp.readLine());
        for(int x=1;x<=N;x++)
        {
            System.out.print("Input A Sentence :");
            Sent=inp.readLine();
            obj.println(Sent);
        }
        obj.close();
 }
}