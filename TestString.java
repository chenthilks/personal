
public class TestString 
{
  public static void main(String args[])
  {
	String s1= "QWERT";
	String s2= "QWERT";
	String s3= "ASDFG";
	String s4= "VVVVV";
	
	System.out.println(s1==s2);
	System.out.println(s3==s4);
	String s5=new String("GFGF");
	String s6=new String("GFGF");
	String s7=new String("HHHH");
	String s8=new String("VVVV");
	System.out.println(s5==s6);
	System.out.println(s5.equals(s6));
	System.out.println(s7==s8);
	  
  }	
}
