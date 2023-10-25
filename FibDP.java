// Joseph Gong and Matthew Tran
// Fibonnacci Dynamic Programming

public class FibDP{
    private static int[] table;

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (table[n] != 0) {
            return table[n];
        }

        table[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return table[n];
    }
    //Print Time
    public static void outputTime(int n){
        long startTime = System.currentTimeMillis();
        int fibdp = fibonacci(n);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Fib Number " + n + " = " + fibdp + " (" + totalTime + "ms)" );
    }

    
    public static void main(String[] args){
        int maxSize = 0;
    
        for (String s : args) {
            int size = Integer.parseInt(s);
            if (size > maxSize) {
                maxSize = size;
            }
        }

        table = new int[maxSize + 1];
    
        for (String s : args) {
            outputTime(Integer.parseInt(s));
        }         
    }
    
}