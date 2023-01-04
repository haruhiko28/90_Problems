import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++){
            B[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(A);
        Arrays.sort(B);

        long ans = 0;
        for (int i=0;i<A.length;i++){
            ans += Math.abs(A[i] - B[i]);   
        }
        System.out.println(ans);
    }
}
