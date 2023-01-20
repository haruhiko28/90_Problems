import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();

            long [] l = new long[2*N];
            
            for(int i=0;i<N;i++){
                long full = sc.nextLong();
                long part = sc.nextLong();
                l[2*i] = part;
                l[2*i+1] = full - part;
            }
            Arrays.sort(l);
                        
            sc.close();

            long ans = 0;
            for (int j=2*N-1;j>2*N-1-K;j--){
                ans += l[j];
            }

            System.out.println(ans);
    }
}