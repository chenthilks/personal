
public class TestArrays 
{
	public static void main(String[] args) 
	{

		int[] newArray= {33,55,33,22,33};

		for(int i=0;i<newArray.length;i++)
		{
			System.out.println(newArray[i]);
		}
		System.out.println("*****************");
	
		for(int i:newArray)
		{
					System.out.println(i);
		}
		
	}

}
