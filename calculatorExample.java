package week1.day2.assigments;

public class calculatorExample 
{
	public int addTwoNumbers(int a,int b)
	{
		return(a+b);
	}
	
	public int subtractTwoNumbers(int a,int b)
	{
		return(a-b);
	}
	
	public double multiplyTwoNumbers(Double a, Double b)
	{
		return(a*b);
	}
	
	public float divideTwoNUmebrs(Float a, Float b)
	{
		return(a/b);
	}
	
	public static void main(String[] args) 
	{
		calculatorExample obj=new calculatorExample();
		
		int addTwoNumbers = obj.addTwoNumbers(9, 3);
		System.out.println("Addition Value");
		System.out.println("---------------");
		System.out.println(addTwoNumbers);
		
		
		int subtractTwoNumbers = obj.subtractTwoNumbers(9, 3);
		System.out.println("Subtraction Value");
		System.out.println("---------------");
		System.out.println(subtractTwoNumbers);
		
		double multiplyTwoNumbers = obj.multiplyTwoNumbers(9d, 3d);
		System.out.println("Multipliation Value");
		System.out.println("---------------");
		System.out.println(multiplyTwoNumbers);
		
		float divideTwoNUmebrs = obj.divideTwoNUmebrs(9f, 3f);
		System.out.println("Division Value");
		System.out.println("---------------");
		System.out.println(divideTwoNUmebrs);
		
		System.out.println("\n");
		
		System.out.println(obj);
		
	}
	


}
