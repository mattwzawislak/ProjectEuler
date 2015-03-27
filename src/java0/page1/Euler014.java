package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler014 extends Project {

    public int number() {
        return 14;
    }

    private static final int[] REGISTRY = new int[1000000];

    public String call() {
        int longest = 0;
        int best = 0;
        for (int i = 1; i < 1000000; i++) {
            long num = i;
            int chain = 0;
            while (num != 1) {
                if (num < REGISTRY.length && REGISTRY[(int) num] != 0) {
                    chain += REGISTRY[(int) num];
                    break;
                }
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = 3 * num + 1;
                }
                chain++;
            }
            REGISTRY[i] = chain;
            if (chain > longest) {
                longest = chain;
                best = i;
            }
        }
        return String.valueOf(best);
    }
}