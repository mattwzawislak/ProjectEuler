package page1;

/**
 * @author Obicere
 */
public class Euler015 {

    public static void main(final String[] args){
        // 40!/(20! * 20!) -> (21 * 22 * ... * 40) / (1 * 2 * ... * 20)
        // Assuming this, we can devise the following:
        long num = 1;
        for(int i = 1; i <= 20; i++){
            num *= (i + 20);
            num /= i;
        }
        System.out.println(num);
    }

}
