import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test {
    // 等差数列
	public static void main(String[] args) throws Exception{
		
		URL url = new URL("http://www.simuquanyi.com/index/voucher/index/id/16.html");
		URLConnection conn = url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String s = "";
		String s1 = "666789";
		String s2 = "123456";
		String s3 = "123456";
		String s4 = "123456";
		String s5 = "123456";
		System.out.println(br.readLine());
		while((s=br.readLine()) != null){
			System.out.println(s);
		}
		
	}
}
