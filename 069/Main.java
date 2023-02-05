import java.util.Scanner;

public class Main {
    final static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        sc.close();
        if(K==1){
            System.out.println(N==1?1:0);
        } else if(N==1){
            System.out.println(K % mod);
        } else if(N==2){
            System.out.println(K * (K-1) % mod);
        } else {
            System.out.println(K * (K-1) % mod * binpower(K-2, N-2) % mod);
        }
    }

    static long binpower(long a, long b){
        long ans = 1;
        while(b!=0){
            if (b%2==1){
                ans = ans * a % mod;
            }
            a = a * a % mod;
            b/=2;
        }
        return ans;
    }
}
