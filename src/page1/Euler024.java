package page1;

import euler.Common;

import java.util.ArrayList;

/**
 * page1
 * Created: 1/21/14 1:27 PM
 *
 * @author Obicere
 * @version 1.0
 */
public class Euler024 {

    private static final int LIMIT = 1000000;

    public static void main(final String[] args){
        int limit = LIMIT - 1;
        int start = 10;
        final StringBuilder builder = new StringBuilder(start);
        final ArrayList<Integer> digits = new ArrayList<>(start);
        for(int i = 0; i < start; i++){
            digits.add(i);
        }
        while(start > 0){
            int next = Common.factorial(start - 1);
            int i = limit / next;
            limit -= i * next;
            builder.append(digits.remove(i));
            start--;
        }
        System.out.println(builder);
    }
}
