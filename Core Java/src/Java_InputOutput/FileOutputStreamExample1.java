package Java_InputOutput;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {

	public static void main(String[] args)
	{
		try
		{
			//craete object of fileoutputstream class
			FileOutputStream fout=new FileOutputStream("F:\\ex.txt");
			String strr="My Name is Tanmay Kumar";
			byte b[]=strr.getBytes();
			//write data in file
			fout.write(b);
			//close file
			fout.close();
		} 
		catch (Exception e)
		{
        System.out.println(e);		
         }

	}

}
