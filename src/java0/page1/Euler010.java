package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler010 extends Project {

    public int number() {
        return 10;
    }

    public String call() {
        long sum = 2;
        for (int i = 3; i < 2000000; i += 2) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return String.valueOf(sum);
    }
}