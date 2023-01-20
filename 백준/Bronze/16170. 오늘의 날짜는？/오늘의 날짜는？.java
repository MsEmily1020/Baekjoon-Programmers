import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
	public static void main(String[] args) {
		ZonedDateTime time = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(time.getYear() + "\n" + time.getMonthValue() + "\n" + time.getDayOfMonth());
	}
}