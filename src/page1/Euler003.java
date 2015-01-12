package page1;

import euler.project.Project;

/**
 * @author Obicere
 */
public class Euler003 extends Project {

    public int number() {
        return 3;
    }

    public void run() {
        long number = 600851475143L;
        int maxRange = (int) Math.sqrt(number) + 1;
        for (int i = maxRange; i >= 2; i--) {
            if (number % i == 0 && isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}