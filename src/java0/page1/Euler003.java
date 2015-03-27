package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler003 extends Project {

    public int number() {
        return 3;
    }

    public String call() {
        long number = 600851475143L;
        int maxRange = (int) Math.sqrt(number) + 1;
        for (int i = maxRange; i >= 2; i--) {
            if (number % i == 0 && isPrime(i)) {
                return String.valueOf(i);
            }
        }
        return null;
    }
}