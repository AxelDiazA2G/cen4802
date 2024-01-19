public class Main {
    public static void main(String[] args) {
        int n = 10;
        int fibonacciNumber = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibonacciNumber + ".");
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
