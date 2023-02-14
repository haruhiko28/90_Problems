import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        sc.close();

        int mod = 1000000007;
        long ans = 0;
        ans = fnc(L, R, mod);
        System.out.println(ans);
    }

    public static long fnc(long l, long r, int mod){
        long count = 0;
        long l_len = String.valueOf(l).length(); 
        long r_len = String.valueOf(r).length(); 

        for (long i=l_len;i<=r_len;i++){
            long x = Math.max(l, (long)Math.pow(10,i-1));
            long y = Math.min(r, (long)Math.pow(10,i)-1);
            long ans = (((i*((y-x+1)%mod))%mod)*((x+y)%mod)) %mod;
            
            if(ans%2==0){
                ans = ans/2;
            }else{
                ans = (ans + mod)/2;
            }
            count += ans;
            count = count % mod;
        }
        return count;
    }
}
