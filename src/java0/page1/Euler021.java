package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler021 extends Project {

    public int number() {
        return 21;
    }

    public String call() {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            int num = sum(getDivisors(i));
            int otherNum = sum(getDivisors(num));
            if (otherNum == i && num != i) {
                sum += i;
            }
        }
        return String.valueOf(sum);
    }
}