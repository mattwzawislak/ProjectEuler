package page1;

import euler.Project;

/**
 * @author Obicere
 */
public class Euler021 extends Project {

    public int number() {
        return 21;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            int num = sum(getDivisors(i));
            int otherNum = sum(getDivisors(num));
            if (otherNum == i && num != i) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}