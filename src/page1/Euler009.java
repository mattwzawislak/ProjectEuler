package page1;

import euler.Project;

/**
 * @author Obicere
 */
public class Euler009 extends Project {

    public int number() {
        return 9;
    }

    public void run() {
        for (int a = 1; a <= 998; a++) {
            for (int b = a + 1; b <= 999 - a; b++) {
                int c = 1000 - (a + b);
                if (a * a + b * b == c * c) {
                    System.out.println(a * b * c);
                    break;
                }
            }
        }
    }
}