public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        int result = climbingStairs(n);
        System.out.println(result);

    }

    public static int climbingStairs(int n) {
        if (n <= 2) return n;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }
        return second;

    }
}
