import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test {
    // 快速排序

		
		URL url = new URL("http://www.simuquanyi.com/index/voucher/index/id/16.html");
		URLConnection conn = url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String s = "";
		System.out.println(s);

		while((s=br.readLine()) != null){
			System.out.println(s);
		}
		
	}
}
