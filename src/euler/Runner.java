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

    private static final File DIRECTORY = new File("out\\production\\ProjectEuler");
    private static final FileFilter FILE_FILTER = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.getName().matches("Euler\\d+\\.class");
        }
    };
    private static final FileFilter PAGE_FILTER = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.isDirectory() && pathname.getName().matches("page\\d+");
        }
    };
    private static final HashMap<Integer, ArrayList<File>> PROJECT_MAPPING = new HashMap<>();

    public static void main(final String[] args) {
        try {
            final Scanner in = new Scanner(System.in);
            System.out.println("Please select the page you would like to access: ");
            final File[] files = DIRECTORY.listFiles(PAGE_FILTER);
            for (int i = 0; i < files.length; i++) {
                final File file = files[i];
                final String name = file.getName().replace("page", "");
                final int number = Integer.parseInt(name);
                final ArrayList<File> list = new ArrayList<>();
                Collections.addAll(list, file.listFiles(FILE_FILTER));
                PROJECT_MAPPING.put(number, list);

                System.out.printf("\t%d) %s\n", i + 1, file.getName());
            }

            final int page = in.nextInt();
            final ArrayList<File> selectedPage = PROJECT_MAPPING.get(page);

            if (selectedPage == null) {
                System.out.println("\nInvalid page. Page " + page + " not found!");
                System.exit(0);
            }

            System.out.println("\nPlease select the file you would like to run: ");
            for (int i = 0; i < selectedPage.size(); i++) {
                System.out.printf("\t%d) %s\n", i + 1, selectedPage.get(i).getName().replace(".class", ""));
            }

            final int project = in.nextInt() - 1; // Arrays are 0-based
            final File selectedFile = selectedPage.get(project);

            if(selectedFile == null){
                System.out.println("\nInvalid file. File " + project + " not found!");
                System.exit(0);
            }

            final Class<?> cls = Class.forName(classNameFromFile(page, selectedFile));
            final Method method = cls.getMethod("main", String[].class);

            System.out.println("\n-----------------------------------------------------\n");
            final long start = System.currentTimeMillis();
            method.invoke(cls.newInstance(), (Object) null);
            System.out.println("\n-----------------------------------------------------\n");
            System.out.printf("Execution time: %dms", System.currentTimeMillis() - start);

        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    private static String classNameFromFile(final int page, final File file){
        return String.format("page%d.%s", page, file.getName().replace(".class", ""));
    }

}
