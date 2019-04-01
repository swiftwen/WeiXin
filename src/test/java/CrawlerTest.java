import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlerTest {

	public static void main(String[] args)throws Exception {

		Pattern p = Pattern.compile("^\\d{19}$");
		String s = "89111111111122223349";
		
		Matcher m = p.matcher(s);
		if(m.find()){
			System.out.println(m.group());
		}
			
	}

}
