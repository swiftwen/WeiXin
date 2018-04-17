public class Solution {
    
	public int digitCounts(int k, int n) {
		int ans = 0;
		int val = n;
		int cnt = 0;
		while(val>0) {
			cnt++;
			val/=10;
		}
		for(int i=1;i<cnt;i++) {
			
		}
		return ans;
    }
    public static void main(String[] args) {
		System.out.println(new Solution().digitCounts(1,12));
	}
}