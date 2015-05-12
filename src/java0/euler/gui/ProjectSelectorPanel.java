package java0.euler.gui;

import java0.euler.project.Project;
import org.obicere.utility.swing.WrapLayout;

import javax.swing.JPanel;
import java.awt.Component;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Obicere
 */
public class ProjectSelectorPanel extends JPanel {

    private final ProjectPanel[] panels;

    public ProjectSelectorPanel(final List<Project> projects) {
        super(new WrapLayout(WrapLayout.LEFT, 5, 5));

        Objects.requireNonNull(projects);

        this.panels = new ProjectPanel[projects.size()];

        Collections.sort(projects);

        final int projectsLength = projects.size();
        for (int i = 0; i < projectsLength; i++) {
            final Project project = projects.get(i);
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
            revalidate();
            updateUI();
        }
    }

}
