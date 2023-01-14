// 桁落ちに注意する問題

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();
        long r = B / gcd(A, B);
        long ans = A * r;

        if (r > 1000000000000000000L / A){
            System.out.println("Large");
        } else {
            System.out.println(ans);
        }
    }

	static long gcd(long A, long B){
        if(B == 0){
            return A;
        }
        return gcd(B, A % B);
    }
}
