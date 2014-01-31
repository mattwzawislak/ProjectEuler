package page1;

import euler.Common;

/**
 * @author Obicere
 */
public class Euler002 {

    public static void main(final String[] args){
        int sum = 0;
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            final int fib = Common.fibonacci(i);
            if(fib > 4000000){
                break;
            }
            if(fib % 2 == 0){
                sum += fib;
            }
        }
        System.out.println(sum);
    }

}
