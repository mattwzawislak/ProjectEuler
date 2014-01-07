package page1;

import euler.Common;

/**
 * @author Obicere
 */
public class Euler010 {

    public static void main(final String[] args){
        long sum = 2;
        for(int i = 3; i < 2000000; i += 2){
            if(Common.isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
