package com.inheritance;
//Example of Single Class Inheritance
public class Example extends Dog
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.Animal();
	}	

}

class Dog
{
	void Animal()
	{
		System.out.println("Eating");
	}
}
