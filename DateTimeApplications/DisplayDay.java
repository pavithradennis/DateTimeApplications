package DateTimeApplications;
//program to display the day of a particular date
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DisplayDay {

	public static void main(String[] args) throws IOException, ParseException {
		// date format object
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date om dd/mm/yyyy format");

		// input the date entered
		String s = br.readLine();
		Date date = sdf.parse(s);

		// get the day using the inbuilt-function
		System.out.println("The day of the date entered is:");
		System.out.println(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).getDayOfWeek());
	}

}
