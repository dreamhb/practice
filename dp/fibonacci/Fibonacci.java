import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int input = Integer.valueOf(args[0]);
        System.out.println("the dynamic programming fibonacci of the number: " + input + " is " + fibonacciDP(input));
        //System.out.println("the fibonacci of the number: " + input + " is " + fibonacci(input));
    }


    private static long fibonacci(long input) {

        if (input == 0) {
            return 0;
        }

        if (input == 1) {
            return 1;
        }

        return fibonacci(input - 2) + fibonacci(input-1);
    }


    static Map<Long, Long> cache = new HashMap<>();

    /**
     * using top-down
     *
     * */
    private static long fibonacciDP(long input) {
        if (cache.containsKey(input)) {
            return cache.get(input);
        }

        if (input == 0) {
            cache.put(input, 0L);
            return 0;
        }

        if (input == 1) {
            cache.put(input, 1L);
            return 1;
        }

        long value =  fibonacciDP(input-2) + fibonacciDP(input-1);
        cache.put(input, value);
        return value;
    }


    /**
     * using bottom-up
     * TODO
     */
    private static long fibonacciDPV2(long input) {
    }
}
