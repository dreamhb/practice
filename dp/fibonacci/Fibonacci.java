import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int input = Integer.valueOf(args[0]);
        System.out.println("the dynamic programming fibonacci of the number: " + input + " is " + fibonacciDP(input));
        System.out.println("the fibonacci of the number: " + input + " is " + fibonacciDPV2(input));
    }


    /**
     * brute force
     *
     * time complexity 2^n
     *
     * */
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
     * dp top-down
     * time complexity n^2
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
     * dp bottom-up
     * time complexity n^2
     */
    private static long fibonacciDPV2(long input) {

        long pre = 0;
        long prepre = 0;
        long result = 0;
        for (int i = 0; i <= input; i++) {
            if (i == 0) {
                pre = 0;
                prepre = 0;
            }

            if (i == 1) {
                pre = 0;
                prepre = 0;
                result = 1;
                continue;
            }

            if (i == 2) {
                pre = 1;
                prepre = 0;
            }

            result = pre + prepre;
            prepre = pre;
            pre = result;
        }

        return result;
    }
}
