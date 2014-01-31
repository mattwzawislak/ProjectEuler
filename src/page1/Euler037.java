package page1;

import euler.Common;

/**
 * @author Obicere
 */
public class Euler037 {

    public static void main(final String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 8; count < 11; i++) {
            if (isTruncatablePrime(i)) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum);
    }

    public static boolean isTruncatablePrime(final int num) {
        int temp = num;
        int shift = 1;
        while (temp > 0) {
            if (!Common.isPrime(temp)) {
                return false;
            }
            temp /= 10;
            if (temp > 0) {
                shift *= 10;
            }
        }
        temp = num % shift;
        while (temp > 0) {
            if (!Common.isPrime(temp)) {
                return false;
            }
            shift /= 10;
            temp %= shift;
        }
        return true;
    }

}
