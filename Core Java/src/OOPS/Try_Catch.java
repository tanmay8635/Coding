package OOPS;

public class Try_Catch
{
	public static void main(String[] args) {
		try 
		{
			int a=10;
			int b=a/0;
			int c=b/2;
			System.out.println("I am in Try Block");
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("I am in finally block");
		}
	}

}
