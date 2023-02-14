import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        long D = 1000000007L;
        sc.close();
        long ans = 0;
        for (long i=L;i<R+1;i++){
            int valLen = String.valueOf(i).length(); 
            ans += valLen * i;
            ans %= D;
        }
        System.out.println(ans);
    }
}
