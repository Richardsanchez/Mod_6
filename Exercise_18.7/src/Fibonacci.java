/**
 * Created by richarddev on 4/18/17.
 */
import java.util.Scanner;

public class Fibonacci {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number at index "
                + index + " is " + fib(index));

        System.out.println("The fib method was called "
                + count + (count == 1 ? " time." : " times."));
    }

    public static long fib(long index) {
        count++;

        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fib(index - 1) + fib(index - 2);
    }
}