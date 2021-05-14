import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendardemo {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy HH:MM:SS");
		Calendar c = Calendar.getInstance();
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println (c.get(Calendar.DAY_OF_MONTH));
	}

}
