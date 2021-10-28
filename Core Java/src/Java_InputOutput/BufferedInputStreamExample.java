package Java_InputOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
public static void main(String[] args) throws Exception
{
	FileInputStream fin=new FileInputStream("F:\\ex.txt");
	BufferedInputStream bin=new BufferedInputStream(fin);
	int i;
	
	//fetch data from file
	while((i=bin.read())!=-1)
	{
		System.out.print((char)i);
	}
	//close stream
	bin.close();
			
}
}
