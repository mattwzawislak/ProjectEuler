package page1;

import euler.Common;

/**
 * @author Obicere
 */
public class Euler021 {

    public static void main(final String[] args){
        int sum = 0;
        for(int i = 1; i < 10000; i++){
            int num = Common.sum(Common.getDivisors(i));
            int otherNum = Common.sum(Common.getDivisors(num));
            if(otherNum == i && num != i){
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
