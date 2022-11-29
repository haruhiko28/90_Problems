import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int[] sumA = new int[N+1];
        int[] sumB = new int[N+1];

        for(int i=1; i<=N; i++) {
            int C = Integer.parseInt(sc.next());
            int P = Integer.parseInt(sc.next());
            if(C == 1){
                sumA[i] = sumA[i-1] + P;
                sumB[i] = sumB[i-1];
            } else {
                sumA[i] = sumA[i-1];
                sumB[i] = sumB[i-1] + P;
            }
        }

        int Q = Integer.parseInt(sc.next());

        for(int i=0; i<Q; i++){
            int L = Integer.parseInt(sc.next());
            int R = Integer.parseInt(sc.next());
            System.out.println((sumA[R] - sumA[L-1]) + " " + (sumB[R] - sumB[L-1]));
        }
    }
}