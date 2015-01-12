package page1;

import euler.project.Project;

/**
 * page1 * Created: 1/21/14 2:10 PM * * @author Obicere * @version 1.0
 */
public class Euler026 extends Project {

    public int number() {
        return 26;
    }

    public void run() {
        int score = 0;
        for (int i = 1000; i > 1; i--) {
            if (i <= score) {
                // Not possible to break score at this value
                break;
            }
            final int[] remainders = new int[i];
            int value = 1;
            int j;
            for (j = 0; remainders[value] == 0 && value != 0; j++) {
                remainders[value] = j;
                value *= 10;
                value %= i;
            }
            final int newScore = j + 1 - remainders[value];
            if (score < newScore) {
                score = newScore;
            }
        }
        System.out.println(score);
    }
}