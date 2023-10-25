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
        long startTime = System.nanoTime();
        int fib = fibonacci(n);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Fib Number " + n + " = " + fib + " (" + totalTime + "ns)" );
    }

    public static void expandTable(int newSize){
        int[] oldTable = table;
        int[] newTable = new int[newSize + 1];
        for(int i = 0; i < oldTable.length; i++){
            newTable[i] = oldTable[i];
        }
        table = newTable;
    }
    
    public static void main(String[] args){
        int maxSize = 0;
        table = new int[maxSize];
        for (String s : args) {
            int size = Integer.parseInt(s);
            if (size > maxSize) {
                maxSize = size;
                expandTable(size);
            }
            outputTime(size);

        }      
    }
    
}