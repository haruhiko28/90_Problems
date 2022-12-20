import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        List<Integer> yamafuda = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int T = 0;
        int X = 0;

        for (int i=0; i<Q; i++){
            T = sc.nextInt();
            X = sc.nextInt();

            if (T==1){
                yamafuda.add(0,X);
            }else if(T==2){
                yamafuda.add(X);
            }else {
                ans.add(yamafuda.get(X-1));
            }
        }

        for (int j=0;j<ans.size();j++) {
            System.out.println(ans.get(j));
        }
    }
}
