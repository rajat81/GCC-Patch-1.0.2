package skeleton.answers;
import java.util.*;
public class Question2 {

    public static int riskAndReward(int[] risk, int[] bonus, int[] trader) {
        int finalProfit = 0;
        for (int i = 0; i < trader.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < risk.length; j++) {
                if (trader[i]>= risk[j]) {
                    list.add(bonus[j]);
                }
            }

            finalProfit += Collections.max(list);
        }

        return finalProfit;
       // return -5;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] trader = new int[n];
//        int[] risk = new int[n];
//        int[] bonus = new int[n];
//
//        for (int i = 0; i < n ; i++)
//            trader[i] = sc.nextInt();
//
//        for (int i = 0; i < n ; i++)
//            risk[i] = sc.nextInt();
//
//        for (int i = 0; i < n ; i++)
//            bonus[i] = sc.nextInt();
//    }
}
