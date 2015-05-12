package java0.euler;

import java0.euler.gui.FrameManager;
import java0.euler.project.Project;
import org.obicere.utility.reflect.Reflection;

import javax.swing.SwingUtilities;
import java.util.ArrayList;
import java.util.Set;

/**
 * @author Obicere
 */
public class Driver {

    public static void main(final String[] args) {

        final Set<Class<Project>> stream = Reflection.subclassOf(Project.class);
        final ArrayList<Project> list = new ArrayList<>();

        stream.forEach(c -> list.add(Reflection.newInstance(c)));

        SwingUtilities.invokeLater(() -> new FrameManager(list));
    }

}
