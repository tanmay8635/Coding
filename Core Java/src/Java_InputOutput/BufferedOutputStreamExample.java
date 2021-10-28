package Java_InputOutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample 
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("F:\\ex.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String str="Hello";
		//taking each bytre of string str and store into byte array
		byte b[]=str.getBytes();
		//write data in file
		bout.write(b);
		//clos estream
		bout.close();
		System.out.println("Success");
	}

}
