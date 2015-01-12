package page1;

import euler.project.Project;

/**
 * @author Obicere
 */
public class Euler031 extends Project {

    public int number() {
        return 31;
    }

    public void run() {
        final int target = 200;
        final int[] coinSizes = {1, 2, 5, 10, 20, 50, 100, 200};
        final int[] ways = new int[target + 1];
        ways[0] = 1; // 0 choose 0 results in a base case of binomial coefficient
        for (final int coinSize : coinSizes) {
            for (int j = coinSize; j <= target; j++) {
                // combination of previous ways with remainder from target
                ways[j] += ways[j - coinSize];
            }
        }
        System.out.println(ways[target]); // Print out ways to get 200 pence        // for example, ways[2] would represent ways to get 2 pence, etc.
    }
}