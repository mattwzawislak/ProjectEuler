package page1;

import euler.project.Project;

/**
 * @author Obicere
 */
public class Euler040 extends Project {

    public int number() {
        return 40;
    }

    public void run() {
        final StringBuilder builder = new StringBuilder(1000000);
        for (int i = 1; builder.length() < 1000000; i++) {
            builder.append(i);
        }
        int result = 1;
        for (int i = 0; i < 7; i++) {
            result *= builder.charAt((int) Math.round(Math.pow(10, i) - 1)) - '0';
        }
        System.out.println(result);
    }
}