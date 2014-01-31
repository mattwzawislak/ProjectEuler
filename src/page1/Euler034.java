package page1;

import euler.Common;

/**
 * @author Obicere
 */
public class Euler034 {

    public static void main(final String[] args){
        int totalSum = 0;
        for(int i = 3; i < 100000; i++){ // By plotting you can see the divergence
            int sum = 0;
            final int[] digits = Common.getDigits(i);
            for(final int digit : digits){
                sum += Common.factorial(digit);
            }
            if(sum == i){
                totalSum += i;
            }
        }
        System.out.println(totalSum);
    }

}
