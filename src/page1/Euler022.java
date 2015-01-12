package page1;

import euler.project.Project;

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
public class Euler022 extends Project {

    public int number() {
        return 22;
    }

    public String call() {
        try {
            final Scanner in = new Scanner(new FileInputStream(new File("F:\\Programming\\out\\production\\ProjectEuler\\page1\\names.txt")));
            final LinkedList<String> list = new LinkedList<>();
            in.useDelimiter("[^A-Z]+");
            while (in.hasNext()) {
                list.add(in.next());
            }
            Collections.sort(list);
            final Iterator<String> iter = list.iterator();
            int sum = 0;
            for (int i = 1; iter.hasNext(); i++) {
                sum += alphaValue(iter.next()) * i;
            }
            return String.valueOf(sum);
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
            return "Resource file was not found.";
        }
    }

    public static int alphaValue(final String str) {
        int sum = 0;
        for (final char c : str.toCharArray()) {
            sum += c - '@';
        }
        return sum;
    }
}