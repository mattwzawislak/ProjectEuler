package java0.page1;

import java0.euler.project.Project;

import java.util.HashSet;

/**
 * @author Obicere
 */
public class Euler029 extends Project {

    public int number() {
        return 29;
    }

    private static final int LIMIT = 100;

    public String call() {
        final HashSet<Double> seen = new HashSet<>();
        for (int a = 2; a <= LIMIT; a++) {
            for (int b = 2; b <= LIMIT; b++) {
                seen.add(Math.pow(a, b));
            }
        }
        return String.valueOf(seen.size());
    }
}