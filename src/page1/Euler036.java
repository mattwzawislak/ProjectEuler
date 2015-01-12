package page1;

import euler.Project;

/**
 * @author Obicere
 */
public class Euler036 extends Project {

    public int number() {
        return 36;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            if (isPalindrome(String.valueOf(i)) && isPalindrome(Integer.toBinaryString(i))) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}