    import java.util.Scanner;
    public class Main {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int T = sc.nextInt();
            int L = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Q = sc.nextInt();

            for (int i=0;i<Q;i++){
                // 入力を受け取る
                int E = sc.nextInt();

                double radian = 2 * Math.PI * E / T;
                double s = Math.sin(radian);
                double c = Math.cos(radian);
                
                double y = -Math.sin(radian) * L / 2;
                double z = (double)L / 2 * (1 - Math.cos(radian));
                double xy = Math.pow(Math.pow(X, 2) + Math.pow(Y - y, 2), 0.5);
                System.out.println(Math.toDegrees(Math.atan(z / xy)));
            }
            sc.close();
        }    
    }
