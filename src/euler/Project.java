package euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Obicere
 */
public abstract class Project implements Runnable {

    private static final ArrayList<Integer> FIBONACCI = new ArrayList<>();
    private static final ArrayList<Integer> FACTORIAL = new ArrayList<>();

    static {
        FIBONACCI.add(0);
        FIBONACCI.add(1);
        FIBONACCI.add(1);
        FACTORIAL.add(1);
        FACTORIAL.add(1);
    }

    public abstract int number();

    public abstract void run();

    public boolean isPrime(final int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= (int) Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] getPrimeFactors(int num) {
        final ArrayList<Integer> factors = new ArrayList<>();
        while (num > 1) {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0 && isPrime(i)) {
                    num /= i;
                    factors.add(i);
                    break;
                }
            }
        }
        final int[] nums = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            nums[i] = factors.get(i);
        }
        return nums;
    }

    public int fibonacci(final int i) {
        if (i < 0) {
            return 0;
        }
        if (i < FIBONACCI.size()) {
            return FIBONACCI.get(i);
        }
        final int num = fibonacci(i - 2) + fibonacci(i - 1);
        FIBONACCI.add(num);
        return num;
    }

    public boolean isPalindrome(final String str) {
        if (str.length() <= 1) {
            return true;
        }
        return str.charAt(0) == str.charAt(str.length() - 1) && isPalindrome(str.substring(1, str.length() - 1));
    }

    public int[] getDivisors(final int num) {
        final List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        final int nums[] = new int[list.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public int sum(final int[] nums) {
        int sum = 0;
        for (final int n : nums) {
            sum += n;
        }
        return sum;
    }

    public boolean isAbundant(final int num) {
        return sum(getDivisors(num)) > num;
    }

    public int factorial(final int num) {
        if (num < 0) {
            return 0;
        }
        if (num < FACTORIAL.size()) {
            return FACTORIAL.get(num);
        }
        final int result = num * factorial(num - 1);
        FACTORIAL.add(num, result);
        return result;
    }

    public int[] getDigits(final int num) {
        if (num < 0) {
            return new int[0];
        }
        final int count = (int) Math.log10(num) + 1;
        final int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[count - i - 1] = (num / (int) Math.pow(10, i)) % 10;
        }
        return digits;
    }

    public boolean isPandigital(final int nums[], final int order) {
        final int[] clone = nums.clone();
        Arrays.sort(clone);
        for (int i = 1; i <= order; i++) {
            if (clone[i - 1] != i) {
                return false;
            }
        }
        return true;
    }

    public int[] combine(final int[]... lists) {
        int length = 0;
        for (final int[] list : lists) {
            length += list.length;
        }
        final int[] newList = new int[length];
        int index = 0;
        for (final int[] subList : lists) {
            System.arraycopy(subList, 0, newList, index, subList.length);
            index += subList.length;
        }
        return newList;
    }

    public int[] reduce(final int numerator, final int denominator) {
        int num = numerator;
        int denom = denominator;
        final int[] factorsNum = getPrimeFactors(num);
        final int[] factorsDenom = getPrimeFactors(denom);
        top:
        for (final int factorNum : factorsNum) {
            for (final int factorDenom : factorsDenom) {
                if (factorNum == factorDenom) {
                    num /= factorNum;
                    denom /= factorDenom;
                    continue top;
                }
            }
        }
        return new int[]{num, denom};
    }

    public int numberFromDigits(final int[] digits) {
        int num = 0;
        int radix = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            num += radix * digits[i];
            radix *= 10;
        }
        return num;
    }
}
