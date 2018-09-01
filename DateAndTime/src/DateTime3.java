import java.time.LocalDateTime;
import java.time.Month;

public class DateTime3 {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.of(1990, 06, 30, 05, 10, 25);

		System.out.println(dt);

		LocalDateTime dt2 = LocalDateTime.of(2016, Month.JULY, 30, 05, 10, 25);

		System.out.println(dt2);
		
		System.out.println(dt2.plusMonths(6));
		
		System.out.println(dt2.minusMonths(6));

	}
}
