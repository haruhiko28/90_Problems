import java.util.Scanner;

public class Main {

    // Strが整合しているかどうか
    public static boolean isvalid(String Str){
        int score = 0;
        for (int i=0;i<Str.length();i++){
            String c = Str.substring(i, i+1);
            if(c.equals("(")) ++score;
            else if (c.equals(")")) --score;

            // 途中で0を下回るとだめ
            if (score < 0) return false;
        }
        // System.out.print(score);
        // 最後に0ならtrue, そうでないならfalse
        return score==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // かっこ列を順に列挙
        for (int bit=0; bit<(1<<N); bit++){
            String S = "";

            // 最上位の桁かが順に見ていく
            for (int i=N-1; i>=0;i--){
                if ((bit & (1 << i)) == 0) S+= "(";
                else S += ")";
            }
            // System.out.println(S);
            // 整合していたら出力
            if (isvalid(S)) System.out.println(S);
        }
    }
}
