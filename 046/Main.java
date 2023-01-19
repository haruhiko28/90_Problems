import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        long [] A = new long[47];
        long [] B = new long[47];
        long [] C = new long[47];
        
        for (int i=0;i<N;i++) {
            A[sc.nextInt()%46]++;
        
        }
        for (int i=0;i<N;i++) {
            B[sc.nextInt()%46]++;
        
        }
        for (int i=0;i<N;i++) {
            C[sc.nextInt()%46]++;
        
        }
        sc.close();
        
        
        long ans = 0;

        for (int i=0;i<46;i++) {
            for (int j=0;j<46;j++) {
                if ( 46 - i - j >= 0) {
                    ans += A[i] * B[j] * C[(46-i-j) % 46];
                } else {
                    int k = (i + j) % 46;
                    ans += A[i] * B[j] * C[46 - k];
                }
            }
        }
        System.out.println(ans);
    }
}