package page1;

import euler.Common;

/**
 * @author Obicere
 */
public class Euler038 {

    public static void main(final String[] args){
        int highest = 0;
        for(int i = 1; i < 100000; i++){
            int[] digits = Common.getDigits(i);
            int n = 2;
            while(digits.length < 9){
                final int next = i * n;
                digits = Common.combine(digits, Common.getDigits(next));
                n++;
            }
            if(digits.length == 9){
                if(Common.isPandigital(digits, 9)){
                    highest = Math.max(Common.numberFromDigits(digits), highest);
                }
            }
        }
        System.out.println(highest);
    }

}
