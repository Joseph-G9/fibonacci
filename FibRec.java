// Joseph Gong and Matthew Tran
// Fibonacci Recursion

public class FibRec {

    //Uses O(2^n) time complexity
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //Print Time
    public static void outputTime(int n){
        long startTime = System.nanoTime();
        int fib = fibonacci(n);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Fib Number " + n + " = " + fib + " (" + totalTime + "ns)" );
    }
    public static void main(String[] args){
        for(String s : args){
            outputTime(Integer.parseInt(s));
        }         
    }
}