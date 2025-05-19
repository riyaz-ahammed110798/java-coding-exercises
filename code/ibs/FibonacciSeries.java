package code.ibs;

/**
 * Print Fibonacci Series up to N Terms
 */
public class FibonacciSeries {
    static void fibonacci(int n){
        int a = 0, b = 1, sum = 0;
        for(int i = 0; i <= n; i++){
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
    public static void main(String[] args) {
        fibonacci(10);
    }
}
