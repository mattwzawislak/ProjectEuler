package page1;

/**
 * @author Obicere
 */
public class Euler006 {

    public static void main(final String[] args){
        int sum1 = 0;
        for(int i = 0; i <= 100; i++){
            sum1 += i;
        }
        sum1 *= sum1;
        int sum2 = 0;
        for(int i = 0; i <= 100; i++){
            sum2 += i * i;
        }
        System.out.println(sum1 - sum2);
    }

}
