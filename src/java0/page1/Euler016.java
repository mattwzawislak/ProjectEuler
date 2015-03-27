package java0.page1;

import java0.euler.project.Project;

import java.math.BigInteger;

/**
 * @author Obicere
 */
public class Euler016 extends Project {

    public int number() {
        return 16;
    }

    public String call() {
        final BigInteger integer = new BigInteger("2").pow(1000);
        final String string = integer.toString();
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += string.charAt(i) - '0';
        }
        return String.valueOf(sum);
    }
}