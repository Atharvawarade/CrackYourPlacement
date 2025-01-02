import java.util.*;

class Test {
    static int Knapsack(int[] wt, int[] val, int cap, int n){
        if(n==0||cap==0)
            return 0;
        if(wt[n-1]<=cap)
            return Math.max((val[n-1]+Knapsack(wt, val, cap-wt[n-1], n-1)),Knapsack(wt, val, cap, n-1));
        else if(wt[n-1]>cap)
            return Knapsack(wt, val, cap, n-1);
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int wt[] = new int[10];
        int val[] = new int[10];
        System.out.println("Enter the weights of 10 elements:");
        for(int i=0;i<10;i++){
            wt[i] = sc.nextInt();
        }
        System.out.println("Enter the values of 10 elements:");
        for(int i=0;i<10;i++){
            val[i] = sc.nextInt();
        }
        System.out.println("Enter the maximum capacity of the bag:");
        int cap = sc.nextInt();
        int max_profit = Knapsack(wt,val,cap,10);
        System.out.println(max_profit);
    }
}



