package page1;

import euler.project.Project;

/**
 * @author Obicere
 */
public class Euler007 extends Project {

    public int number() {
        return 7;
    }

    public void run() {
        int number = 0;
        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                number++;
                if (number == 10001) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}