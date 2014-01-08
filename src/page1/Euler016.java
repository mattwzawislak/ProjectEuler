package page1;

import java.math.BigInteger;

/**
 * @author Obicere
 */
public class Euler016 {

    public static void main(final String[] args){
        final BigInteger integer = new BigInteger("2").pow(1000);
        final String string = integer.toString();
        int sum = 0;
        for(int i = 0; i < string.length(); i++){
            sum += string.charAt(i) - '0';
        }
        System.out.println(sum);
    }

}
