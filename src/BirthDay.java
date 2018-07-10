import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthDay {
	private static final long YEAR_IN_MILLIS = 31449600000l;

	public static void main(String[] args) throws ParseException { // TODO Auto-generated method stub

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = "11/12/1986";
		
		long today = new Date().getTime();
		long diff = today - simpleDateFormat.parse(date).getTime();
		long age = diff / YEAR_IN_MILLIS;
		System.out.println("age : "+age);
	}
}
