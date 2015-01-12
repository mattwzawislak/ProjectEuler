package page1;

import euler.project.Project;

/**
 * @author Obicere
 */
public class Euler007 extends Project {

    public int number() {
        return 7;
    }

    public String call() {
        int number = 0;
        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                number++;
                if (number == 10001) {
                    return String.valueOf(i);
                }
            }
        }
    }
}