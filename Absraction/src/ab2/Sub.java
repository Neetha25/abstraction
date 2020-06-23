package ab2;

import ab1.Add;

public class Sub extends Add 
{ 
	
	public void add1()
	{
	 int s=a+b;
	 System.out.println("sum :"+s);
	}
        

	public static void main(String[] args)
	{
		Sub s=new Sub();
		s.add1();
		s.print();

	}


	//@Override
	//public void add() {
		// TODO Auto-generated method stub
		
	}


