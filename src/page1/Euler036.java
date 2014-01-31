package page1;

import euler.Common;

/**
 * @author Obicere
 */
public class Euler036 {

    public static void main(final String[] args){
        int sum = 0;
        for(int i = 1; i < 1000000; i++){
            if(Common.isPalindrome(String.valueOf(i)) && Common.isPalindrome(Integer.toBinaryString(i))){
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
