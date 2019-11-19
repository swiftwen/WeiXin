/**
 * 
 * @author swiftwen
 * @date 2019年7月17日 下午5:52:58
 */
public class Singleton {

	private static volatile Singleton singleton = null;
	private Singleton(){
	}
	public static Singleton getInstance(){
		if(null == singleton){
			synchronized (Singleton.class) {
				if(null == singleton){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
