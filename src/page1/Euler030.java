package page1;

import java.util.Arrays;

/**
 * page1
 * Created: 1/22/14 12:38 PM
 *
 * @author Obicere
 * @version 1.0
 */
public class Euler030 {

    public static void main(final String[] args){
        System.out.println(Arrays.toString(getDigits(5918)));
    }

    public static int[] getDigits(final int num){
        if(num < 0){
            return new int[0];
        }
        final int count = (int) Math.log10(num) + 1;
        final int[] digits = new int[count];
        for(int i = 0; i < count; i++){
            digits[count - i - 1] = (num / (int) Math.pow(10, i)) % 10;
        }
        return digits;
    }

}
