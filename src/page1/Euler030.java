package page1;

/**
 * page1
 * Created: 1/22/14 12:38 PM
 *
 * @author Obicere
 * @version 1.0
 */
public class Euler030 {

    public static void main(final String[] args){
        int totalSum = 0;
        for(int i = 2; i < 410000; i++){ // through plotting we can determine max
            final int[] digits = getDigits(i);
            int sum = 0;
            for(final int digit : digits){
                sum += toPowerOfFive(digit);
                if(sum > i){ // No way to continue
                    break;
                }
            }
            if(sum == i){
                System.out.println("Match at: " + i);
                totalSum += i;
            }
        }
        System.out.println(totalSum);
    }

    public static int toPowerOfFive(final int num){
        // Should be faster than calculating Math.pow(double, double).
        // Since we can presume using integer multiplication that this
        // will always be an integer throughout operation.
        return num * num * num * num * num;
    }

    public static int[] getDigits(final int num){
        if(num < 0){
            return new int[0];
        }
        final int count = (int) Math.log10(num) + 1;
        final int[] digits = new int[count];
        for(int i = 0; i < count; i++){
            digits[count - i - 1] = (num / (int) Math.pow(10, i)) % 10;
        }
        return digits;
    }

}
