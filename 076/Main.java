import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long sum = 0;
        for (int i=0;i<N;i++){
            A[i] = Long.parseLong(sc.next());
            sum += A[i];
        }
        sc.close();

        // そもそも合計が10で割れなけばNo
        if (sum%10!=0){
            System.out.println("No");
            return;
        }

        // 初期値
        boolean ans = false;
        int L = 0;
        int R = 0;
        long cur = 0;
        long goal = sum/10;
        while (L<N){
            if(cur==goal){
                ans = true;
                break;
            }else if(cur>goal){
                cur -= A[L++];
            }else {
                cur += A[R++%N];
            }
        }
        System.out.println(ans ? "Yes" : "No");
    }
}
