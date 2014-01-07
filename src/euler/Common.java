package euler;

import java.util.ArrayList;

/**
 * @author Obicere
 */
public class Common {

    private static final ArrayList<Integer> FIBONACCI = new ArrayList<>();

    public static boolean isPrime(final int num){
        if(num == 2){
            return true;
        }
        for(int i = 2; i <= (int) Math.sqrt(num) + 1; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int fibonacci(int i){
        if(i <= 1){
            return i;
        }
        if(i < FIBONACCI.size()){
            return FIBONACCI.get(i);
        }
        final int num = fibonacci(i - 1) + fibonacci(i - 2);
        FIBONACCI.add(num);
        return num;
    }

    public static boolean isPalindrome(final String str){
        if(str.length() <= 1){
            return true;
        }
        return str.charAt(0) == str.charAt(str.length() - 1) && isPalindrome(str.substring(1, str.length() - 1));
    }

}
