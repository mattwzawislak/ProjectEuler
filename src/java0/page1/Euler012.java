package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler012 extends Project {

    public int number() {
        return 12;
    }

    public String call() {
        int num = 0;
        for (int i = 1; i > 0; i++) {  // i > 0 stops potential overflow
            num += i;
            int count = 0;
            for (int x = 1; x <= Math.round(Math.sqrt(num)); x++) {
                if (num % x == 0) {
                    count += 2;
                }
            }
            if (count >= 500) {
                System.out.println(num);
                break;
            }
        }
        return null;
    }
}