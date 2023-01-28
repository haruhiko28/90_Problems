import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[N];
        
        for (int i=0;i<N;i++){
            A[i] = Integer.parseInt(sc.next());
        }
        
        long [] L = new long[Q];
        long [] R = new long[Q];
        long [] V = new long[Q];
        
        for (int i=0;i<Q;i++){
            L[i] = Long.parseLong(sc.next());
            R[i] = Long.parseLong(sc.next());
            V[i] = Long.parseLong(sc.next());
        }

        sc.close();
        
        // 崖と不便度算出
        long[] b = new long[N-1];
        long score = 0;
        for (int i=0; i<N-1; i++){
            b[i] = A[i+1] - A[i];
            score += Math.abs(b[i]);
        }

        for (int q=0;q<Q;q++){
            if (L[q]!=1) {
                long l1 = b[(int)L[q]-2]; // 変化前
                long l2 = l1 + V[q];      // 変化後
                score += Math.abs(l2) - Math.abs(l1); // 不便度の影響
                b[(int)L[q]-2] = l2;
            }
            if (R[q]!=N){
                long r1 = b[(int)R[q]-1];
                long r2 = r1 - V[q];
                score += Math.abs(r2) - Math.abs(r1);
                b[(int)R[q]-1] = r2;
            }
         System.out.println(score);   
        }
    }
}