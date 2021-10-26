package Java_InputOutput;
import java.io.FileOutputStream;
public class FileOutputStreamExample {

	public static void main(String[] args)
	{
	
        try 
        {
        	//create object and pass file location and its name
			FileOutputStream fout=new FileOutputStream("F:\\ex.txt");
			//write date in file 
			fout.write(90); //prints character ascci character
			System.out.println("Success");
			//close file
			fout.close();
		} 
        catch (Exception e)
        {
			System.out.println(e);
		}
	}

}
