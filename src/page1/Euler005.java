package page1;

import euler.project.Project;

/**
 * @author Obicere
 */
public class Euler005 extends Project {

    public int number() {
        return 5;
    }

    public void run() {
        top:
        for (int i = 20; ; i++) {
            for (int j = 2; j <= 20; j++) {
                if (i % j != 0) {
                    continue top;
                }
            }
            System.out.println(i);
            break;
        }
    }
}