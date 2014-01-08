package euler;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Obicere
 */
public class Runner {

    private static final File DIRECTORY = new File("F:\\Programming\\out\\production\\ProjectEuler");
    private static final FileFilter FILE_FILTER = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.getName().contains("Euler");
        }
    };
    private static final FileFilter PAGE_FILTER = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.getName().contains("page") && pathname.isDirectory();
        }
    };
    private static final HashMap<Integer, ArrayList<File>> PROJECT_MAPPING = new HashMap<>();

    public static void main(final String[] args) {
        try {
            final Scanner in = new Scanner(System.in);
            System.out.println("Please select the page you would like to access: ");
            for (final File file : DIRECTORY.listFiles(PAGE_FILTER)) {
                System.out.println("\t" + file.getName());
                final String name = file.getName().replace("page", "");
                final int number = Integer.parseInt(name);
                final ArrayList<File> list = new ArrayList<>();
                Collections.addAll(list, file.listFiles(FILE_FILTER));
                PROJECT_MAPPING.put(number, list);
            }
            final int page = in.nextInt();
            final ArrayList<File> selectedPage = PROJECT_MAPPING.get(page);
            if (selectedPage == null) {
                System.out.println("Invalid page. Page " + page + " not found!");
                System.exit(0);
            }
            System.out.println("Please select the file you would like to run: ");
            for (int i = 0; i < selectedPage.size(); i++) {
                System.out.printf("\t%d) %s\n", i + 1, selectedPage.get(i).getName().replace(".class", ""));
            }
            final int project = in.nextInt();
            System.out.println("\n-----------------------------------------------------\n");
            final Class<?> cls = Class.forName("page" + page + "." + selectedPage.get(project - 1).getName().replace(".class", ""));
            final Method method = cls.getMethod("main", String[].class);
            method.invoke(cls.newInstance(), new Object[1]);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
