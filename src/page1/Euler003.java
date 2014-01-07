package page1;

import euler.Common;

/**
 * @author Obicere
 */
public class Euler003 {

    public static void main(final String[] args){
        long number = 600851475143L;
        int maxRange = (int) Math.sqrt(number) + 1;
        for(int i = maxRange; i >= 2; i--){
            if(number % i == 0 && Common.isPrime(i)){
                System.out.println(i);
            }
        }
    }

}
