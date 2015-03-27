package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler041 extends Project {

    public int number() {
        return 41;
    }

    public String call() {
        for (int i = 987654321; i >= 2143; i -= 2) {
            //final int[] digits = getDigits(i);
            if (isPandigital(i) && isPrime(i)) {
                return String.valueOf(i);
            }
        }
        return null;
    }
}