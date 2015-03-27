package java0.page1;

import javax.swing.JFileChooser;
import java0.euler.project.Project;
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
            final JFileChooser chooser = new JFileChooser();
            chooser.setMultiSelectionEnabled(false);

            final int selection = chooser.showDialog(null, "Open");
            if (selection != JFileChooser.APPROVE_OPTION) {
                return null;
            }
            final Scanner in = new Scanner(new FileInputStream(chooser.getSelectedFile()));
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