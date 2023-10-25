// Joseph Gong and Matthew Tran
// Fibonacci Recursion

public class FibRec {

    //Uses O(2^n) time complexity
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    public static void outputTime(int n){
        long startTime = System.currentTimeMillis();
        int fibrec = Fibonacci(n);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Fib Number " + n + " = " + fibrec + " (" + totalTime + "ms)" );
    }
    public static void main(String[] args){
        for(String s : args){
            outputTime(Integer.parseInt(s));
        }         
    }
}