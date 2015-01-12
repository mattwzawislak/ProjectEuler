package page1;

import euler.project.Project;

/**
 * @author Obicere
 */
public class Euler004 extends Project {

    public int number() {
        return 4;
    }

    public String call() {
        int max = 0;
        for (int i = 999; i > 0; i--) {
            if (i * 999 < max) {
                break;
            }
            for (int j = 999; j >= i; j--) {
                int next = i * j;
                if (isPalindrome(String.valueOf(next))) {
                    if (next > max) {
                        max = next;
                    }
                }
            }
        }
        return String.valueOf(max);
    }
}