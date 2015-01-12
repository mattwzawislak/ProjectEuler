package euler.gui;

import euler.project.Project;
import org.obicere.utility.swing.WrapLayout;

import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author Obicere
 */
public class ProjectSelectorPanel extends JPanel {

    private final ProjectPanel[] panels;

    public ProjectSelectorPanel(final Project[] projects) {
        super(new WrapLayout(WrapLayout.LEFT, 5, 5));

        Objects.requireNonNull(projects);

        this.panels = new ProjectPanel[projects.length];

        Arrays.sort(projects);

        final int projectsLength = projects.length;
        for (int i = 0; i < projectsLength; i++) {
            final Project project = projects[i];
            if (project == null) {
                continue;
            }
            final ProjectPanel panel = new ProjectPanel(project);
            add(panel);
            panels[i] = panel;
        }
    }

    public void search(final String number) {
        synchronized (getTreeLock()) {
            for (final Component child : getComponents()) {
                if (!(child instanceof ProjectPanel)) {
                    continue;
                }
                remove(child);
            }
            for (final ProjectPanel panel : panels) {
                if (panel.getNumberString().contains(number)) {
                    add(panel);
                }
            }
        }
    }

}
