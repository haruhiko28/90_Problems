import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long maxA = N/A;
        long maxB = N/B;
        sc.close();
        int ans = 10000;

        for (int i=0;i<10000 && i<=maxA;i++){
            
            for (int j=0;j<10000 && j<=maxB;j++){
                long tmp = N - (i*A + j*B);
                if (tmp%C==0 && tmp<=N && tmp>=0){
                    ans = (int) Math.min(ans, i + j +Math.floor(tmp/C));
                }
            }
        }
        System.out.println(ans);
    }
}
