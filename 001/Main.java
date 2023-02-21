import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();

        int left = 0;
        int right = L;

        while((right-left)>1){
            int mid = (left + right) / 2;
            int p = 0;
            int cut = 0;
            boolean flag = true;
            for (int i=0;i<N;i++){
                if (((A[i]-p)>=mid)&&((L-A[i])>=mid)){
                    cut += 1;
                    p = A[i];
                    if (cut>=K){
                        left = mid;
                        flag = false;
                        break;
                        } 
                } else {
                    continue;
                }
            }
            if (flag){
                right = mid;
            }
        }
        System.out.println(left);
    }    
}
