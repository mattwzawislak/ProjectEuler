package page1;

/**
 * @author Obicere
 */
public class Euler039 {

    public static void main(final String[] args) {
        int best = 0;
        int score = 0;
        for (int p = 2; p <= 1000; p++) {
            int possible = 0;
            for (int a = 2; a < p / 3; a++) {
                if (p * (p - 2 * a) % (2 * (p - a)) == 0) {
                    possible++;
                }
            }
            if (possible > score) {
                score = possible;
                best = p;
            }
        }
        System.out.println(best);
    }
}
