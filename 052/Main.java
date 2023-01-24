import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long THD = (long)Math.pow(10, 9) + 7L;
        long ans = 1;
        for (int i=0;i<N;i++){
            int tmp_sum = 0;
            for (int j=0;j<6;j++){
                int tmp = sc.nextInt();
                tmp_sum += tmp;
            }
            ans *= tmp_sum;
            ans %= THD;

        }
        sc.close();
        System.out.println(ans);
    }
}