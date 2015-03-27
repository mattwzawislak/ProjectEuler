package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler001 extends Project {

    @Override
    public int number() {
        return 1;
    }

    @Override
    public String call() {
        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return String.valueOf(sum);
    }

}
