import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long counter = 0; // 因数の数をカウント
        long root = (long) Math.ceil(Math.sqrt(N));

        // 因数分解をする時は2から√xまでの数でxを順番に割っていき、
        // もし割り切れたらその商を更に同じ約数で割ることで達成できる
        for (int i=2;i<=root;i++){
            while(N%i==0){
                counter++;
                N /= i;
            }
        }

        if (N!=1) {
            counter++;
        }

        long ans = log2(counter);
        System.out.println(ans);
    }
    public static long log2(long x) {
        return (long) Math.ceil(Math.log(x) / Math.log(2));
    }
}
