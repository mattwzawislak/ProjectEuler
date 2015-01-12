package page1;

import euler.Project;

/**
 * @author Obicere
 */
public class Euler002 extends Project {

    public int number() {
        return 2;
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            final int fib = fibonacci(i);
            if (fib > 4000000) {
                break;
            }
            if (fib % 2 == 0) {
                sum += fib;
            }
        }
        System.out.println(sum);
    }
}