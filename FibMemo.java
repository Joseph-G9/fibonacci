// Joseph Gong and Matthew Tran
// Fibonnaci Memoization
import java.util.*;
public class FibMemo{
    // Maximum cache size
    private static final int CACHE_SIZE = 15;

    // Memoization cache using LinkedHashMap
    private static Map<Integer, Integer> cache = new LinkedHashMap<Integer, Integer>(CACHE_SIZE + 1, 0.75f, true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > CACHE_SIZE;
        }
    };

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }

        // Check if value is already in cache
        if (cache.containsKey(num)) {
            return cache.get(num);
        }

        int result = fibonacci(num - 1) + fibonacci(num - 2);
        cache.put(num, result);  // Store result in cache
        return result;
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
        for(String s : args){
            outputTime(Integer.parseInt(s));
        }     
    }
}
