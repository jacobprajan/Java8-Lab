import java.time.LocalDateTime;

public class DateTime2 {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();

		System.out.println(dt);

		int dd = dt.getDayOfMonth();

		int mm = dt.getMonthValue();

		int yyyy = dt.getYear();

		System.out.printf("%d-%d-%d", dd, mm, yyyy);
		
		System.out.println("");

		int hh = dt.getHour();

		int m = dt.getMinute();

		int ss = dt.getSecond();

		int nanoSec = dt.getNano();

		System.out.printf("%d:%d:%d:%d", hh, m, ss, nanoSec);

	}

}
