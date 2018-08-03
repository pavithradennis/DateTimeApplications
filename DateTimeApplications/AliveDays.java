package DateTimeApplications;
//program to find the number of days alive
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class AliveDays {

	public static void main(String[] args)
	{
		//to find the number of days between the date entered and the current date
		//create instance object from date object
		System.out.println("Number of days alive is:" + " "+ ChronoUnit.DAYS.between(LocalDateTime.ofInstant(new Date("04/02/1996").toInstant(),  ZoneId.systemDefault()), LocalDateTime.now()));
		

	}

}
