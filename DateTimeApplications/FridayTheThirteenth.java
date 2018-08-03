package DateTimeApplications;
//program to find Friday the 13s in a particular period
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class FridayTheThirteenth {
	public static void main(String[] args) throws ParseException {
		LocalDate startDate = LocalDate.of(1900, 1, 1);
		LocalDate endDate = LocalDate.of(2000, 1, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMMMM-YYYY");
		System.out.println("List of Friday the 13ths are:");
		
		//loop for the date
		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			//checking if the day is friday and date is 13
			if (date.getDayOfMonth() == 13 && (date.getDayOfWeek().toString().equalsIgnoreCase("Friday")))
				System.out.println(sdf1.format(sdf.parse(date.toString())));

		}

	}
}
