package page1;

import euler.Common;

/**
 * @author Obicere
 */
public class Euler004 {

    public static void main(final String[] args){
        int max = 0;
        for(int i = 999; i > 0; i--){
            if(i * 999 < max){
                break;
            }
            for(int j = 999; j >= i; j--){
                int next = i * j;
                if(Common.isPalindrome(String.valueOf(next))){
                    if(next > max){
                        max = next;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
