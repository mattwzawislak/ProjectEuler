package page1;

import java.math.BigInteger;

/**
 * @author Obicere
 */
public class Euler020 {

    public static void main(final String[] args) {
        BigInteger integer = new BigInteger("1");
        for(int i = 1; i < 100; i++){
            integer = integer.multiply(new BigInteger(String.valueOf(i)));
        }
        final String str = integer.toString();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);

    }

}
