import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        long[] dp = new long[N+1];
        dp[0] = 1;
        for (int i=1;i<=N;i++){
            if(i<L) {
                dp[i] = dp[i-1];
            } else {
                dp[i] = (long)((dp[i-1]+dp[i-L]) % 1000000007);
            }
        }
        System.out.println(dp[N]);
    }
}