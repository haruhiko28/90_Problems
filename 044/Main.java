import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        int[] L = new int[N];
        for(int i=0;i<N;i++){
            L[i] = sc.nextInt();
        }
        
        int shiftcount = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<Q;i++){
            int T = sc.nextInt();
            int X = (sc.nextInt()-shiftcount-1) % N;
            X = X < 0 ? X + N : X;
            int Y = (sc.nextInt()-shiftcount-1) % N;
            Y = Y < 0 ? Y + N : Y;

            if (T==1){
                int tmp = L[X];
                L[X] = L[Y];
                L[Y] = tmp;
            } else if(T==2){
                shiftcount++;
                // Collections.rotate(L, 1);
            } else {
                sb.append(L[X]);
                sb.append( "\n");
            }
        }
        System.out.println( sb.toString());
    }
}