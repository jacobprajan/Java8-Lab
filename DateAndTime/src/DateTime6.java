import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime6 {

	
	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.systemDefault();
		
		System.out.println(zone);
		
		ZonedDateTime zd = ZonedDateTime.now(zone);
		
		System.out.println(zd);
		
	}
}
