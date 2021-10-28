package Java_InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInputstreamExample1 
{
	public static void main(String[] args)
	{
		String str="";
      try 
      {
  		FileInputStream fin1=new FileInputStream("F:\\ex.txt");
  		FileInputStream fin2=new FileInputStream("F:\\tk.txt");
  		SequenceInputStream sis=new SequenceInputStream(fin1, fin2);
  		
  		int j;
  		while((j=sis.read())!=-1)
  		{
  			str=str+Character.toString(j);
  		}
  		fin1.close();
  		fin2.close();
  		sis.close();
  		
  		FileOutputStream fout=new FileOutputStream("F:\\ex1.txt");
  		byte b[]= str.getBytes();
  		fout.write(b);
  		fout.close();
  		
  		System.out.println("Success");
	  } 
      catch (Exception e) 
      {
            System.out.println(e);	 
      }
      
      
	}

}
