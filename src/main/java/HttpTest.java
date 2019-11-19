import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.aitravelba.util.HttpUtil;
import com.alibaba.fastjson.JSONObject;

public class HttpTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		HttpUtil httpUtil = new HttpUtil();
		Map<String,String> paramMap = new HashMap<String,String>();
		Map<String,String> headers = new HashMap<String,String>();
		Req req = new Req();
		req.setLoginName("admin or 1=1");
		req.setAutoLogin("1");
		req.setPassword("1 or 1=1");
		String url = "http://www.huishenghuo.ink/webLogin?loginName=admin&password="+req.getPassword();
		//while(true){
			String ret = httpUtil.httpPost(url, paramMap, headers, JSONObject.toJSONString(req));
			System.out.println("ret:");
			System.out.println(ret);
		//}
	}

}
class Req implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String loginName;
	
	private String password;
	
	private String autoLogin;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAutoLogin() {
		return autoLogin;
	}

	public void setAutoLogin(String autoLogin) {
		this.autoLogin = autoLogin;
	}
	
	
}
