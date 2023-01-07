import java.util.Scanner;

public class Main {

    public static int log2(int x) {
        return (int) (Math.log(x) / Math.log(2) + 1e-10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(log2(a)<b*log2(c)){
            System.out.println("Yes");    
        } else {
            System.out.println("No");
        }
    }    
}
