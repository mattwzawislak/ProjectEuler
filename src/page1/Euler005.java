package page1;

/**
 * @author Obicere
 */
public class Euler005 {

    public static void main(final String[] args){
        top: for(int i = 20;;i++){
            for(int j = 2; j <= 20; j++){
                if(i % j != 0){
                    continue top;
                }
            }
            System.out.println(i);
            break;
        }
    }

}
