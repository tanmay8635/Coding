package Java_InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class SequenceInputstreamExample 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("F:\\ex.txt");
		FileInputStream fin1 = new FileInputStream("F:\\tk.txt");
		SequenceInputStream sis=new SequenceInputStream(fin, fin1);
		int j;
		while((j=sis.read())!=-1)
		{
			System.out.print((char)j);
		}
		fin.close();
		fin1.close();
		sis.close();
	}

}
