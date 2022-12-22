import java.util.*;
import java.io.*;


public class Main2 {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        int k = Integer.parseInt(s[1]);
        String ans = s[0];
        for(int i = 0; i < k; i++){
        ans = Long.toString(Long.parseLong(ans,8),9);
        ans = ans.replaceAll("8","5");
        }
        out.println(ans);
    }
}
