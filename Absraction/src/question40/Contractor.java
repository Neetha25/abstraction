package question40;

public class Contractor extends Employee

{
public void calculateSalary(float bp,int bon,int ded)

{
float hra=basicpay*5/100;
float pf=basicpay*20/100;
float totalsal=basic+hra+bonus(deduction-pf)
float totalpay=totalsal*time;


}
public void fulltimeemp();
{
	
}
public static void main(String args[])
{
	Contractor ob=new Contractor();
	ob.calculateSalary(400,200,300);
}
}