import java.time.LocalDate;
import java.time.Period;

public class DateTime4 {

	public static void main(String[] args) {
		
		LocalDate bd = LocalDate.of(1986, 06, 30);
		
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(bd, today);
		
		System.out.printf("Your age is : %d years %d months %d days", p.getYears(), p.getMonths(), p.getDays());
		
		System.out.println("");
		
		LocalDate deathDay = LocalDate.of(1986+75, 07, 30);
		
		Period p2 = Period.between(today, deathDay);
		
		int days = p2.getYears()*365 + p2.getMonths()*30 + p2.getDays();
		
		System.out.printf("You will be on earth only %d days", days);
		
	}
}
