
public class trycatch {

	public static void main(String[] args) {
		int a[][] = {{12,10,12},{9,12,34}};
		/*int a=3;
		int b=0;*/
		
		try
		{
			//int c=a/b;
			//System.out.println(c);
			System.out.println(a[3][4]);
		}
		catch(IndexOutOfBoundsException ind)
		{
			System.out.println("This is array exception");
		}
		catch(ArithmeticException ar)
		{
			System.out.println("This is arithmetic exception");
		}
		finally {
			System.out.println("final statement");
		}

	}

}
