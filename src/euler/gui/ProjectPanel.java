package euler.gui;

import euler.project.Project;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.Dimension;

/**
 * @author Obicere
 */
public class ProjectPanel extends JPanel {

    private static final Dimension PREFERRED_SIZE = new Dimension(150, 75);

    private static final Border    DEFAULT_BORDER = BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), BorderFactory.createEmptyBorder(5, 5, 5, 5));

    private final String numberString;

    public ProjectPanel(final Project project) {

        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

        this.numberString = String.valueOf(project.number());

        final JLabel label = new JLabel("Project Euler #".concat(numberString));
        final JButton run = new JButton("Run");

        run.addActionListener(e -> project.run());

        add(label);
        add(Box.createHorizontalGlue());
        add(run);

        setBorder(DEFAULT_BORDER);

    }

    public String getNumberString() {
        return numberString;
    }

    @Override
    public Dimension getPreferredSize() {
        return PREFERRED_SIZE;
    }

}
