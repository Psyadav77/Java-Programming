package practice;

public class methodExample1
{
	public static void main(String[] args)
	{
		int result1= boxsize(5);
		System.out.println(result1);
		}
		public static int  boxsize(int size)
		{
		int total= size*size*size;
		return total;
		}
}