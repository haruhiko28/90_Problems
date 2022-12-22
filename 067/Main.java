import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int K = sc.nextInt();
        sc.close();
        if (N.equals("0")){
            System.out.println(0);
            return;
        }
        
        
        for (int i=0;i<K;i++){
            // 9進法にする処理
            N = base8Tobase9(N);
            // 5に書き直す処理
            N = N.replace('8', '5');
            
        }
        System.out.println(N);
    } 

    public static String base8Tobase9(String N){
        long T = 0;
        long x = 1;
        int m = N.length();

        for (int j=m-1;j>=0;j--){
            T += Character.getNumericValue(N.charAt(j)) * x;
            x *= 8L;
        }
        String ans = "";
        while(T>0){
            String c = String.valueOf(T%9);
            ans = c + ans;
            T/=9;
        }
        return ans;
    }
}
