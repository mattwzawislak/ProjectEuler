package page1;

import euler.project.Project;

/**
 * page1 * Created: 1/21/14 3:02 PM * * @author Obicere * @version 1.0
 */
public class Euler028 extends Project {

    public int number() {
        return 28;
    }

    private static final int SIZE       = 1001;
    private static final int LAST_LIMIT = SIZE * SIZE;

    public void run() {
        int sum = 1;
        int last = 1;
        for (int i = 2; last < LAST_LIMIT; i += 2) {
            //for (int j = 0; j < 4; j++) {
            //    last += i;
            //    sum += last;
            // }
            // x = (n + i) + (n + i + i) + (n + i + i + i) + (n + i + i + i + i)
            // x = 4n + 10i
            sum += 10 * i + 4 * last;
            last += 4 * i;
        }
        System.out.println(sum);
    }
}