package com.InstanceAndLocal;

//Instance Variables example
class Demo1
{ 

	//Instance variables/Object variables/Fields/Properties
	int a;            
	int b;          //jvm assigns default values to instance values as a=0, b=0, d=0.0
	Double d;
	
	void display()
	{
		a=10;   
		b=20;
		d=31.3;
		
		 
		System.out.println(a);
		
		System.out.println(b);
		 
	    System.out.println(d);
		
	}
	
	
}


//Local variables Examples
class Demo2
{
	
	void show()
	{
		
		//Local variables
		int x=30;
		int y=40;          //jvm is not able to assign the default values to the local variables.
		
		System.out.println(x);
		
		System.out.println(y);
	}
	
	
	/*void show1()
	{
		System.out.println(x);  //here we can not access x value that will leads to compile time error.
		
	}*/

}


//Main class
public class LaunchDemo {

	public static void main(String[] args) 
	{
	 
       Demo1 d1 = new Demo1();   //Object creation/Object Instantiation
       
       d1.display();
       
       Demo2 d2 = new Demo2();
       
       d2.show();
    }

}
