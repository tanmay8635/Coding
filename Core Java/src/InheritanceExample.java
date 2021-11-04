//Example of Interface:
public class InheritanceExample implements InheritanceERxample1
{
	public  void show()
	{
		System.out.println("Today is Diweali");
	}
	
	public static void main(String[] args)
	{
		InheritanceExample i1 = new InheritanceExample();
		i1.show();
	}
      
}

interface InheritanceERxample1
{
   public  void show();	
}
