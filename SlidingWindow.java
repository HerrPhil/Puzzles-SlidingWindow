import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
import java.math.BigInteger;

public class SlidingWindow {

    public static void main(String [] args) {
        System.out.printf("Hello Sliding Window Solution%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java SlidingWindow%n");
            System.out.printf("    The problem being solved is%n");
            System.out.printf("    find the maximum number of consecutive 1's%n");
            System.out.printf("    when you can flip at most k 0's.%n");
            return;
        }

//        int [] input = new int [] {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int [] input = new int [] {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
//        int k = 2;
        int k = 3;

        SlidingWindow slidingWindow = new SlidingWindow(input, k);

        int result = slidingWindow.solution();

        System.out.printf("%nthe maximum number of consecutive 1's when at most %d 0's can be flipped is %d%n", k, result);

    }

    private int [] input;
    private int k;

    public SlidingWindow(int [] input, int k) {

        this.input = input;
        this.k = k;

    }

    public int solution() {

        int left = 0;
        int maxxx = 0;
        int n = input.length;
        int numOfZeros = 0;

        for (int right = 0; right < n; right++) {

            System.out.printf("%nfor right index %d%n", right);

            if (input[right] == 0) {

                System.out.printf("%nthe input at right index is zero%n");

                numOfZeros++;

                System.out.printf("%nincrement numOfZeros to %d%n", numOfZeros);

            }

            while (numOfZeros > this.k) {

                System.out.printf("%nwhile the numOfZeros = %d is greater than k = %d%n", numOfZeros, k);

                System.out.printf("%nleft index %d%n", left);

                if (input[left] == 0) {

                    System.out.printf("%nthe input at left index is zero%n");

                    numOfZeros--;

                    System.out.printf("%ndecrement numOfZeros to %d%n", numOfZeros);

                }

                left++;

                System.out.printf("%nincrement left index to %d%n", left);

            }

            System.out.printf("%nthe maximum number of consecutive 1's is maxxx = %d, or right (%d) - left (%d) + 1 = %d%n", maxxx, right, left, right - left + 1);

            maxxx = Math.max(maxxx, right - left + 1); // inclusive


        }

        return maxxx;

    }

}
