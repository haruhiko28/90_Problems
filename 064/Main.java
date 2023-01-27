import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[N];
        
        for (int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        
        int[] L = new int[Q];
        int[] R = new int[Q];
        int[] V = new int[Q];
        
        for (int i=0;i<N;i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }

        sc.close();

                
    }
}