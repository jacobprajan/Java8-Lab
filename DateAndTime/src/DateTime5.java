import java.time.Year;

public class DateTime5 {

	public static void main(String[] args) {

		Year y = Year.of(2000);

		System.out.println(y.isLeap());
		
		Year y2 = Year.of(2002);

		System.out.println(y2.isLeap());

	}

}
