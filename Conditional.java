
public class Conditional
{
	public static void main(String args[])
	{
	 int a=7,b=5,max=0;
		if (a > b) {
		  max = a;
		}
		else {
		  max = b;
		}
		System.out.println(max);
		
		max = (a > b) ? a : b;
	  System.out.println(max);
	}
}
