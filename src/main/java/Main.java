import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @desc 
 * @Author wenpeng
 * @2018年4月3日 下午3:58:47
 */
public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}
}
