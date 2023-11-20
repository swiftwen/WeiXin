import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * 
 * @author swiftwen
 * @date 2019年11月18日 下午2:42:26
 */
public class Test {

	public static void main(String[] args) throws Exception{
		
		URL url = new URL("http://www.simuquanyi.com/index/voucher/index/id/16.html");
		URLConnection conn = url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String s = "";
		String s1 = "";
		System.out.println(br.readLine());
		while((s=br.readLine()) != null){
			System.out.println(s);
		}
		
	}
}
