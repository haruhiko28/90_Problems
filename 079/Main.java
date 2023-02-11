import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 入力部
        int H = sc.nextInt();
        int W = sc.nextInt();
        int [][] A = new int[H][W];
        int [][] B = new int[H][W];

        for (int i=0;i<H;i++){
            for (int j=0;j<W;j++){
                A[i][j] = Integer.parseInt(sc.next());
            }
        }
        for (int i=0;i<H;i++){
            for (int j=0;j<W;j++){
                B[i][j] = Integer.parseInt(sc.next());
            }
        }
        sc.close();
        
        // intだとWA...
        long cnt = 0;

        // 操作実施
        for (int h=0;h<H-1;h++){
            for (int w=0;w<W-1;w++){
                int diff = B[h][w] - A[h][w];
                A[h][w] += diff;
                A[h+1][w] += diff;
                A[h][w+1] += diff;
                A[h+1][w+1] += diff;
                cnt += Math.abs(diff);
            }
        }
        
        // 全ての値が一致しているか確認
        boolean ans = true;
        for (int h=0;h<H;h++){
            for (int w=0;w<W;w++){
                if (A[h][w]==B[h][w]){
                    continue;
                } else {
                    ans = false;
                    break;
                }
            }
        }

        // 回答出力
        if (ans){
            System.out.println("Yes");
            System.out.println(cnt);
        } else {
            System.out.println("No");
        }
        
    }    
}
