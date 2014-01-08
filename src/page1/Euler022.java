package page1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Obicere
 */
public class Euler022 {

    public static void main(final String[] args) throws FileNotFoundException {
        final Scanner in = new Scanner(new FileInputStream(new File("F:\\Programming\\out\\production\\ProjectEuler\\page1\\names.txt")));
        final LinkedList<String> list = new LinkedList<>();
        in.useDelimiter("[^A-Z]+");
        while(in.hasNext()){
            list.add(in.next());
        }
        Collections.sort(list);
        final Iterator<String> iter = list.iterator();
        int sum = 0;
        for(int i = 1; iter.hasNext(); i++){
            sum += alphaValue(iter.next()) * i;
        }
        System.out.println(sum);
    }

    public static int alphaValue(final String str){
        int sum = 0;
        for(final char c : str.toCharArray()){
            sum += c - '@';
        }
        return sum;
    }

}
