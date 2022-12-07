import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i=0; i<N; i++){
            A[i] = Integer.parseInt(sc.next());
        }

        for (int i=0; i<N; i++){
            B[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int abs = 0;
        for (int i=0; i<N; i++){
            abs += Math.abs(A[i] - B[i]);
        }

        int ans = K - abs;
        if(ans >= 0){
            if (ans%2==0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

    }
}