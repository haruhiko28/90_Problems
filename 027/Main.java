import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> set = new HashSet<>();

        int n = Integer.parseInt(sc.nextLine());
        // int n = sc.nextInt();
        int now = 0;
        
        for(int i = 0; i < n; i++){
            String st = sc.nextLine();
            set.add(st);
            
            if(now+1 == set.size()){
                System.out.println(i+1);
                now++;
            }
        }
    }
}