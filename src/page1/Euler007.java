package page1;

import euler.Common;

/**
 * @author Obicere
 */
public class Euler007 {

    public static void main(final String[] args){
        int number = 0;
        for(int i  = 2;; i++){
            if(Common.isPrime(i)){
                number++;
                if(number == 10001){
                    System.out.println(i);
                    break;
                }
            }
        }
    }

}
