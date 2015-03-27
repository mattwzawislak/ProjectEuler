package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler037 extends Project {

    public int number() {
        return 37;
    }

    public String call() {
        int sum = 0;
        int count = 0;
        for (int i = 8; count < 11; i++) {
            if (isTruncatablePrime(i)) {
                sum += i;
                count++;
            }
        }
        return String.valueOf(sum);
    }

    public boolean isTruncatablePrime(final int num) {
        int temp = num;
        int shift = 1;
        while (temp > 0) {
            if (!isPrime(temp)) {
                return false;
            }
            temp /= 10;
            if (temp > 0) {
                shift *= 10;
            }
        }
        temp = num % shift;
        while (temp > 0) {
            if (!isPrime(temp)) {
                return false;
            }
            shift /= 10;
            temp %= shift;
        }
        return true;
    }
}