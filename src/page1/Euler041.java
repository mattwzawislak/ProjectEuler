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

    public void run() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 987654321; i >= 1; i--) {
            final int[] digits = getDigits(i);
            if (isPandigital(digits, digits.length)) {
                list.add(i);
            }
        }
        System.out.println("Got all pandigitals");
        for (int i = list.size() - 1; i >= 0; i--) {
            if (isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}