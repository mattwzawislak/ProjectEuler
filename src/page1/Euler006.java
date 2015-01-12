package page1;

import euler.project.Project;

/**
 * @author Obicere
 */
public class Euler006 extends Project {

    public int number() {
        return 6;
    }

    public String call() {
        int sum1 = 0;
        for (int i = 0; i <= 100; i++) {
            sum1 += i;
        }
        sum1 *= sum1;
        int sum2 = 0;
        for (int i = 0; i <= 100; i++) {
            sum2 += i * i;
        }
        return String.valueOf(sum1 - sum2);
    }
}