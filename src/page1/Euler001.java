package page1;

import euler.Project;

/**
 * @author Obicere
 */
public class Euler001 extends Project {

    @Override
    public int number() {
        return 1;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
