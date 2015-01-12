package page1;

import euler.Project;

import java.math.BigInteger;

/**
 * @author Obicere
 */
public class Euler016 extends Project {

    public int number() {
        return 16;
    }

    public void run() {
        final BigInteger integer = new BigInteger("2").pow(1000);
        final String string = integer.toString();
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += string.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}