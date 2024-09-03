import java.util.*;

class GfG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                arr.add(x);
            }
            int m = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.findMinDiff(arr, n, m));
        }
    }
}

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int min = Math.abs(a.get(m - 1) - a.get(0));
        for(int i = 1; i < n - m + 1; i++){
            if(Math.abs(a.get(i + m - 1) - a.get(i)) < min){
                min = Math.abs(a.get(i + m - 1) - a.get(i));
            }
        }
        return (long)min;
    }
}