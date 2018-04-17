import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @desc 
 * @Author wenpeng
 * @2018年4月3日 下午3:58:47
 */
public class Main {

	static final int N = 22;
	static int[] arr = new int[N];
	static int[] c = new int[1000010];
	static int[] flag = new int[N];
	static int[] h = new int[100010];
	static Set<Long> set = new HashSet<Long>();
	public static void init() {
		
	}
	public static void dfs(int k,int n,long sum) {
		set.add(sum);
		for(int i=0;i<n;i++) {
			if(flag[i]==0) {
				flag[i]=1;
				dfs(k+1,n,sum+arr[i]);
				flag[i]=0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		long max = 0;
		int cnt = 0;
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
			max+=arr[i];
			c[cnt++] = arr[i];
			h[arr[i]] = 1;
			int m = cnt;
			for(int j=0;j<m-1;j++) {
				c[cnt++] = c[j]+arr[i];
				h[c[j]+arr[i]]=1;
			}
		}
		for(int i=1;i<=max+1;i++) {
			if(h[i]==0) {
				System.out.println(i);
				break;
			}
		}
		in.close();
	}
}
