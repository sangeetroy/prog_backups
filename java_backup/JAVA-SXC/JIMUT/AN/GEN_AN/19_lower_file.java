import java.io.*;
import java.lang.*;
class small_file
{
	public static void main(String args[])throws IOException
	{
		long n,i;
		char ch;
		RandomAccessFile fp1 = new RandomAccessFile (args[0],"rw");
		n=fp1.length();		// size of the input file
		for(i=0;i<n;++i)
		{
			fp1.seek(i);
			ch = (char)fp1.read();
			ch = Character.toLowerCase(ch);
			fp1.seek(i);
			fp1.write(ch);
		}
		fp1.close();
	}
}