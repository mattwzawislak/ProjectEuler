package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler009 extends Project {

    public int number() {
        return 9;
    }

    public String call() {
        for (int a = 1; a <= 998; a++) {
            for (int b = a + 1; b <= 999 - a; b++) {
                int c = 1000 - (a + b);
                if (a * a + b * b == c * c) {
                    return String.valueOf(a * b * c);
                }
            }
        }
        return null;
    }
}