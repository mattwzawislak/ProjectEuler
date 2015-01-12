package page1;

import euler.Project;

import java.util.LinkedHashMap;

/**
 * @author Obicere
 */
public class Euler017 extends Project {

    public int number() {
        return 17;
    }

    private static final LinkedHashMap<Integer, String> DATA = new LinkedHashMap<>();

    static {
        DATA.put(0, "");
        DATA.put(1, "one");
        DATA.put(2, "two");
        DATA.put(3, "three");
        DATA.put(4, "four");
        DATA.put(5, "five");
        DATA.put(6, "six");
        DATA.put(7, "seven");
        DATA.put(8, "eight");
        DATA.put(9, "nine");
        DATA.put(10, "ten");
        DATA.put(11, "eleven");
        DATA.put(12, "twelve");
        DATA.put(13, "thirteen");
        DATA.put(14, "fourteen");
        DATA.put(15, "fifteen");
        DATA.put(16, "sixteen");
        DATA.put(17, "seventeen");
        DATA.put(18, "eighteen");
        DATA.put(19, "nineteen");
        DATA.put(20, "twenty");
        DATA.put(30, "thirty");
        DATA.put(40, "forty");
        DATA.put(50, "fifty");
        DATA.put(60, "sixty");
        DATA.put(70, "seventy");
        DATA.put(80, "eighty");
        DATA.put(90, "ninety");
        DATA.put(100, "hundred");
    }

    public static String format(final int num) {
        if (num == 1000) {
            return "onethousand";
        }
        final StringBuilder builder = new StringBuilder();
        int n = num / 100;
        if (n != 0) {
            builder.append(DATA.get(n));
            builder.append(DATA.get(100));
        }
        int sub = num % 100;
        if (sub == 0) {
            return builder.toString();
        }
        final String next = DATA.get(sub);
        if (builder.length() != 0) {
            builder.append("AND");
        }
        if (next != null) {
            builder.append(next);
            return builder.toString();
        } else {
            for (int i = 90; i >= 20; i -= 10) {
                if (i < sub) {
                    builder.append(DATA.get(i));
                    builder.append(DATA.get(sub % 10));
                    return builder.toString();
                }
            }
        }
        throw new RuntimeException("FAILED TO CREATE STRING");
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            final String format = format(i);
            sum += format.trim().length();
            System.out.println(format);
        }
        System.out.println(sum);
    }
}