import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 入力
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String S = sc.next();
        sc.close();

        long total = (N*(N+1))/2;
        long ret = 0;
        long d = 1;
        char tmp = S.charAt(0);;
        for (int i=1;i<S.length();i++){
            if (tmp==S.charAt(i)){
                d += 1;
            } else {
                ret += (d*(d+1))/2;
                tmp = S.charAt(i);
                d = 1;
            }
        }
        ret += (d*(d+1))/2;
        System.out.println(total-ret);
    }
}
