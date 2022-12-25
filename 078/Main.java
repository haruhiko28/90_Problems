import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Countする用のMapを作成
        Map<Integer, Integer> CountMap = new HashMap<>();

        for(int i=1;i<=N;i++){            
            CountMap.put(i,0);
        }
        
        // 入力からCounterを+1
        for (int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int mx = Math.max(a,b);
            CountMap.put(mx, CountMap.get(mx)+1);
        }
        sc.close();
        // 回答
        int ans = 0;
        for (int i=1;i<=N;i++){
            if (CountMap.get(i)==1){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}