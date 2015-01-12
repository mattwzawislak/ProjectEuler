package page1;

import euler.project.Project;

import java.util.ArrayList;

/**
 * @author Obicere
 */
public class Euler041 extends Project {

    public int number() {
        return 41;
    }

    public String call() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 987654321; i >= 1; i--) {
            final int[] digits = getDigits(i);
            if (isPandigital(digits, digits.length)) {
                list.add(i);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (isPrime(i)) {
                return String.valueOf(i);
            }
        }
        return null;
    }
}