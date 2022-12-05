import java.util.Scanner;

public class Main {
    static long gcd (long a, long b) {
        long temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        sc.close();
        
        long S = gcd(A, gcd(B, C));

        System.out.println((A / S - 1) + (B / S - 1) + (C / S - 1));
    }
}
