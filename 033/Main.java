import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        if (H==1||W==1){
            ans = H * W;
        } else {
            ans = ((H+1)/ 2) * ((W+1)/ 2);
        }
        System.out.println(ans);
    }
}
