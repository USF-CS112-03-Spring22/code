import java.util.Calendar; // Used to get the current time
import java.text.SimpleDateFormat; // Used for formatting the time 

public class CurrentTimeExample {
	
	public static void main(String[] args) {
			Calendar cal = Calendar.getInstance();
            long time = cal.getTimeInMillis();
			
			String dateFormat = "dd-MM-yyyy hh:mm";
       		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
            String formattedDate =  simpleDateFormat.format(time);
            System.out.println(formattedDate);
	}
}