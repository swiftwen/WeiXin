import java.util.ArrayList;
import java.util.List;

class Main {
    public static int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int sum = 0;
        int in = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<in){
                in = prices[i];
            }else if(prices[i]>in){
                sum += prices[i] - in;
                in = prices[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
		int[] arr = new int[]{3,3,5,0,0,3,1,4};
    	System.out.println(maxProfit(arr));
	}
}

