import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime1 {
	
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		System.out.println(now);
		
		int dd =  now.getDayOfMonth();
		
		int mm =  now.getMonthValue();
		
		int yyyy = now.getYear();
		
		System.out.printf("%d-%d-%d", dd, mm, yyyy);
		
		System.out.println("");
		
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		
		int hh = time.getHour();
		
		int m = time.getMinute();
		
		int ss = time.getSecond();
		
		int nanoSec = time.getNano();
		
		System.out.printf("%d:%d:%d:%d", hh, m, ss, nanoSec);
		
		
		
	}

}
