package euler.gui;

import euler.project.Project;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Obicere
 */
public class ProjectPanel extends JPanel {

    private static final String PRETEXT = "Project Euler #";
    private static final String URL     = "https://projecteuler.net/problem=";

    private static final Dimension PREFERRED_SIZE = new Dimension(200, 75);

    private static final Border DEFAULT_BORDER = BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), BorderFactory.createEmptyBorder(5, 5, 5, 5));

    private final String numberString;

    public ProjectPanel(final Project project) {

        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

        this.numberString = String.valueOf(project.number());

        final String url = URL + numberString;
        final String labelText = String.format("<html><a href=\"%s\">%s%s</a></html>", url, PRETEXT, numberString);
        final JLabel label = new JLabel(labelText);

        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI(url));
                } catch (final URISyntaxException | IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Failed to open URL: " + url, "Unable to open webpage", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        final JButton run = new JButton("Run");

        run.addActionListener(e -> {
            final Thread runProject = new Thread(() -> {
                try {
                    final long start = System.currentTimeMillis();
                    final String result = project.call();
                    final long time = System.currentTimeMillis() - start;
                    final JTextArea message = new JTextArea(String.format("Execution completed successfully (%d ms):%n%s", time, result));
                    message.setEditable(false);
                    JOptionPane.showMessageDialog(null, message, "", JOptionPane.PLAIN_MESSAGE);
                } catch (final Exception e1) {
                    e1.printStackTrace();
                }
            });
            runProject.setDaemon(true);
            runProject.start();
        });

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
