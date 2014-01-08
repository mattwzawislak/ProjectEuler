package euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static int[] getDivisors(final int num){
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 2; i < Math.round(Math.sqrt(num)); i++){
            if(num % i == 0){
                list.add(i);
                list.add(num / i);
            }
        }
        Collections.sort(list);
        final int nums[] = new int[list.size()];
        for(int i = 0; i < nums.length; i++){
            nums[i] = list.get(i);
        }
        return nums;
    }

    public static int sum(final int[] nums){
        int sum = 0;
        for(final int n : nums){
            sum += n;
        }
        return sum;
    }

}
