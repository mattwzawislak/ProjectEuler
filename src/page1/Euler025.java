package page1;

import java.math.BigInteger;

/**
 * page1
 * Created: 1/21/14 2:00 PM
 *
 * @author Obicere
 * @version 1.0
 */
public class Euler025 {

    public static void main(final String[] args){
        BigInteger i = new BigInteger("1");
        BigInteger j = new BigInteger("1");
        int count = 2;
        while(true){
            final BigInteger temp = j;
            j = i.add(j);
            i = temp;
            count++;
            if(j.toString().length() == 1000){
                System.out.println(count);
                break;
            }
        }
    }

}