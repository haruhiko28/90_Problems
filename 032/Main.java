import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
            A[i][j] = Integer.parseInt(sc.next());
            }
        }

        int M = sc.nextInt();
        int[][] XY = new int[N][N];
        for (int i=0; i<M; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            XY[X-1][Y-1] = 1;
            XY[Y-1][X-1] = 1;
        }

        sc.close();

        int ans = 100000;
        int[] rand_list = new int[N];
        for (int i=1;i<=N;i++){
            rand_list[i-1] = i;
        }

        ArrayList<ArrayList<Integer>> l = permute(rand_list);
        int tmp = 0;
        for (int i=0;i<l.size();i++){
            tmp = 0;
            boolean flag = true;

            for (int j=0;j<N;j++){
                if (j>0 && XY[l.get(i).get(j-1)-1][l.get(i).get(j)-1]==1){
                        flag = false;
                        break;
                } else {
                    tmp += A[l.get(i).get(j)-1][j];
                }
            } 
            if (flag){
                ans = Math.min(tmp,ans);
            }
        }
        if (ans==100000){
            ans = -1;
        }
        System.out.println(ans);

    }

    public static ArrayList<ArrayList<Integer>> permute(int[] arr) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        permuteHelper(l, new ArrayList<>(), arr);
        return l;
    }
 
    private static void permuteHelper(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> resultList, int [] arr){
        // Base case
        if(resultList.size() == arr.length){
            list.add(new ArrayList<>(resultList));
        }
        else{
            for(int i = 0; i < arr.length; i++){
 
                if(resultList.contains(arr[i]))
                {
                    // If element already exists in the list then skip
                    continue;
                }
                // Choose element
                resultList.add(arr[i]);
                // Explore
                permuteHelper(list, resultList, arr);
                // Unchoose element
                resultList.remove(resultList.size() - 1);
            }
        }
    }

}
