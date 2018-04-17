import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlerTest {

	public static void main(String[] args)throws Exception {

		URL url = new URL("http://www.xtu.edu.cn/");
		URLConnection conn = url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String s = null;
		Pattern pattern = Pattern.compile("<a style=\"color:;\" href=\"");
		while((s=br.readLine())!=null) {
			//System.out.println(s);
			Matcher m = pattern.matcher(s);
			if(m.find()) {
				System.out.println(s);
				Pattern p = Pattern.compile("title=\"\\S*>$");
				Matcher m1 = p.matcher(s);
				if(m1.find()) {
					System.out.println(m1.group());
				}
			}
			
		}
	}

}
