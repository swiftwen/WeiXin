import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author swiftwen
 * @date 2019年7月16日 下午2:11:29
 */
public class Main {
	final static int N = 210;
	static int INF = 1000000000;
	static char[][] g = new char[N][N];


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ca = in.nextInt();
		while (ca-- > 0) {
			int row = in.nextInt();
			int col = in.nextInt();
			if ((row & 1) == 0 && (col & 1) == 0 && (row>=4 || col>=4)) {
                if(row>=col){
                	for(int i=0;i<row;i++){
                		for(int j=0;j<col;j++){
                			if((j&1)==0){
                				g[i][j] = '(';
                			}else{
                				g[i][j] = ')';
                			}
                		}
                	}
                	for(int i=0;i<row/2;i++){
                		for(int j=0;j<col;j++){
                			if(j<col/2){
                				g[i][j] = '(';
                			}else{
                				g[i][j] = ')';
                			}
                		}
                	}
                	for(int i=0;i<row;i++){
                    	for(int j=0;j<col;j++){
                    		System.out.print(g[i][j]);
                    	}
                    	System.out.println();
                    }
                }else{
                	for(int i=0;i<row;i++){
                		for(int j=0;j<col;j++){
                			if((i&1)==0){
                				g[i][j] = '(';
                			}else{
                				g[i][j] = ')';
                			}
                		}
                	}
                	for(int j=0;j<col/2;j++){
                		for(int i=0;i<row;i++){
                			if(i<(row>>1)){
                				g[i][j] = '(';
                			}else{
                				g[i][j] = ')';
                			}
                		}
                	}
                	for(int i=0;i<row;i++){
                    	for(int j=0;j<col;j++){
                    		System.out.print(g[i][j]);
                    	}
                    	System.out.println();
                    }
                }
				continue;
			}
			if ((row & 1) == 0) {
				for (int i = 0; i < row; i++) {
					if ((i & 1) == 0) {
						for (int j = 0; j < col; j++) {
							System.out.print('(');
						}
					} else {
						for (int j = 0; j < col; j++) {
							System.out.print(')');
						}
					}
					System.out.println();
				}
			} else {
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						if ((j & 1) == 0) {
							System.out.print('(');
						} else {
							System.out.print(')');
						}
					}
					System.out.println();
				}
			}

		}

		in.close();
	}
}
