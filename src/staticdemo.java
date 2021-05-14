public class staticdemo{
	String biketype;
	int capacity;
	int kerbweight;
	static String brand;
	static int cylinder;
	static
	{
		brand = "RoyalEnfield";
		cylinder = 1;
	}
	staticdemo(String biketype,int capacity,int kerbweight)
	{
		this.biketype = biketype;
		this.capacity = capacity;
		this.kerbweight = kerbweight;
		System.out.println(biketype + " " + capacity + " " + kerbweight);
	}
	public static void test()
	{
		System.out.println(brand + " " + cylinder);
		
	}
	public void getbiketype()
	{
		System.out.println(biketype);
	}
	public static void main (String args[]){
	staticdemo  a = new staticdemo("Cruiser",350,250);
	staticdemo.test();
	a.getbiketype();
	
}
}