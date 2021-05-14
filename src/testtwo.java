class testone{
	double length;
	int breadth;
	int height;
}
public class testtwo{
	public static void main (String args[]){
	testone volume = new testone();
	volume.length=10;
	volume.breadth=3;
	volume.height=12;
	System.out.println("Volume is " + (volume.length * volume.breadth * volume.height));
}
}
	
