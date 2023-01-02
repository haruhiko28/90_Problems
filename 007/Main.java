import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        
        // Aをソート
        Arrays.sort(A);
        
        int Q = sc.nextInt();

        ArrayList<Double> ans = new ArrayList<Double>();
        
        for(int j=0;j<Q;j++){
            int B = sc.nextInt();

            double left = -1;
            double right = N;

            while ((right - left) > 1) {
                double mid = Math.floor((left + right) / 2);
                if (A[(int)mid] >= B){
                    right = mid;
                }else{
                    left = mid;
                }
            }

            double comp1 = Math.pow(10, 9);
            double comp2 = Math.pow(10, 9);

            if(left >= 0){
                comp1 = Math.abs(A[(int)left] -B);
            }
            if (left <N-1){
                comp2 = Math.abs(A[(int)left+1] -B);
            }
            ans.add(Math.min(comp1,comp2));
        }

        for (double a:ans){
            System.out.println((int)a);
        }
    }    
}
