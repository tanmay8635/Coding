package Java_InputOutput;

import java.io.FileInputStream;

public class FileInputStreamExample1
{
	public static void main(String[] args)
	{
		try 
		{
			FileInputStream fin=new FileInputStream("F:\\ex.txt");
			//read data from file
			int i=0;
			while ((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
