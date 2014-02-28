package page1;

import euler.Common;

import java.util.ArrayList;

/**
 * @author Obicere
 */
public class Euler041 {

    public static void main(final String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 987654321; i >= 1; i--) {
            final int[] digits = Common.getDigits(i);
            if (Common.isPandigital(digits, digits.length)) {
                list.add(i);
            }
        }
        System.out.println("Got all pandigitals");
        for(int i = list.size() - 1; i >= 0; i--){
            if(Common.isPrime(i)){
                System.out.println(i);
                break;
            }
        }
    }

}
