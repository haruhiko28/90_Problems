import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();

        int[] A = new int[N];
        for(int i=0; i<N; i++) {
           A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i=0;i<N;i++){
            long a = A[i] %P;
            for (int j=0;j<i;j++){
                long b = a *A[j] %P;
                for (int k=0;k<j;k++){
                    long c = b *A[k] %P;
                    for (int l=0;l<k;l++) {
                        long d = c *A[l] %P;
                        for (int m=0;m<l;m++){
                            long e = d *A[m] %P;
                            if (e == Q)
                            ++ans;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
