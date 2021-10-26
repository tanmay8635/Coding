package Java_InputOutput;
import java.io.FileInputStream;
public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("F:\\ex.txt");
			//read data from file
           int i=fin.read();
           //print data 
           System.out.println((char)i);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
