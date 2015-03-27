package java0.page1;

import java0.euler.project.Project;

import java.math.BigInteger;

/**
 * @author Obicere
 */
public class Euler025 extends Project {

    public int number() {
        return 25;
    }

    public String call() {
        BigInteger i = new BigInteger("1");
        BigInteger j = new BigInteger("1");
        int count = 2;
        while (true) {
            final BigInteger temp = j;
            j = i.add(j);
            i = temp;
            count++;
            if (j.toString().length() == 1000) {
                return String.valueOf(count);
            }
        }
    }
}