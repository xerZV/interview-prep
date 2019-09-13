package com.simitchiyski.interviewprep.crackingTheCodeInterview;

public class BigOExamples {

    //Each call adds a level to the stack.
    //1 sum(4)
    //2   -> sum(3)
    //3       -> sum(2)
    //4           -> sum(l)
    //5               -> sum(0)
    //For example, code like this would take O(n) time and O(n) space.
    public static int sum(int n) {
        if (n <= 0)
            return n;

        return n + sum(n - 1);
    }

    // ================================= // =================================//

    //    There will be roughly O(n) calls to pairSum. However, those calls do not exist simultaneously on the call
//    stack, so you only need O ( 1) space.
    public static int pairSumSequence(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    private static int pairSum(int a, int b) {
        return a + b;
    }

    // ================================= // =================================//

    //O ( n2 * n ! )
    public static void permutation(String str) {
        permutation(str, "");
    }

    private static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    // ================================= // =================================//
    //This runs in O(sqrt(n)) time.
    public static boolean isPrime(int n) {
        for (int x = 2; x <= sqrt(n); x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

    // ================================= // =================================//
    //We can use the earlier pattern we'd established for recursive calls: O( branchesde pth).
    //There are 2 branches per call, and we go as deep as N, therefore the runtime is O(2^N).
    public static int fib(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    //Many people will rush to concluding that since fib(n) takes 0(2°) time and it's called n times, then it's O(n2^n).
    //Therefore, the runtime to compute the first n Fibonacci numbers (using this terrible algorithm) is still O(2^n).
    public static void allFib(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i));
        }
    }


    // At each call to fib(i), we have already computed and stored the values for fib( i-1) and fib(i-2).
    // We just look up those values, sum them, store the new result, and return. This takes a constant amount of time.
    // We're doing a constant amount of work N times, so this is O (n) time
    // This technique, called memoization, is a very common one to optimize exponential time recursive algorithms.
    public static void allFibWithCache(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fibWithCache(i, memo));
        }
    }

    private static int fibWithCache(int n, int[] memo) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (memo[n] > 0) return memo[n];

        memo[n] = fibWithCache(n - 1, memo) + fibWithCache(n - 2, memo);
        return memo[n];
    }

    // ================================= // =================================//

    //O ( log n).
    public static int powers0f2(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            System.out.println(1);
            return 1;
        } else {
            int prev = powers0f2(n / 2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }

    //Let's walk through a call like powers0f2 ( 50).
    //powers0f2(50)
    //    -> powers0f2(25)
    //        -> powers0f2(12)
    //            -> powers0f2(6)
    //                -> powers0f2(3)
    //                    -> powersOf2(1)
    //                        -> print & return 1
    //                    print & return 2
    //                print & return 4
    //            print & return 8
    //        print & return 16
    //    print & return 32


    // ================================= // =================================//

    // The following code computes the product of a and b. What is its runtime?
    // - O(b)
    public static int product(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }

    // ================================= // =================================//

    // The following code computes a^b. What is its runtime?
    // - O(b)
    public static int power(int a, int b) {
        if (b < 0) {
            return 0; //error
        } else if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }

    // ================================= // =================================//

    // The following code computes a % b. What is its runtime?
    //  - O(1)
    public static int mod(int a, int b) {
        if (b <= 0) {
            return -1;
        }
        int div = a / b;
        return a - div * b;
    }

    // ================================= // =================================//

    // The following code performs integer division. What is its runtime (assume a and b are both positive)?
    //  - O(a/b)
    public static int div(int a, int b) {
        int count = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            count++;
        }
        return count;
    }

    // ================================= // =================================//

    // The following code computes the [integer] square root of a number. If the number is not a
    // perfect square (there is no integer square root) , then it returns -1. It does this by successive
    // guessing. If n is 100, it first guesses SO. Too high? Try something lower - halfway between 1
    // and SO. What is its runtime?
    //  - O(log N)
    public static int sqrt(int n) {
        return sqrt_helper(n, 1, n);
    }

    private static int sqrt_helper(int n, int min, int max) {
        if (max < min) return -1; // no square root
        int guess = (min + max) / 2;
        if (guess * guess == n) { // found it!
            return guess;
        } else if (guess * guess < n) { // too low
            return sqrt_helper(n, guess + 1, max); // try higher
        } else { // too high
            return sqrt_helper(n, min, guess - 1); // try lower
        }
    }
}
