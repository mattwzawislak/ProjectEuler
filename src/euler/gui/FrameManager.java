package euler.gui;

import euler.project.Project;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.BorderLayout;
import java.awt.Dimension;

/**
 * @author Obicere
 */
public class FrameManager {

    private static final Dimension PREFERRED_SIZE = new Dimension(640, 400); // 640 = 3 * panel_width + 5 * hgap + vertical scrollbar width

    public FrameManager(final Project[] projects) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (final ClassNotFoundException e) {
            e.printStackTrace();
        } catch (final InstantiationException e) {
            e.printStackTrace();
        } catch (final IllegalAccessException e) {
            e.printStackTrace();
        } catch (final UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        final JFrame frame = new JFrame("Project Euler");

        final JTextField filter = new JTextField();

        final ProjectSelectorPanel selector = new ProjectSelectorPanel(projects);
        final JScrollPane scrollPane = new JScrollPane(selector, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        filter.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(final DocumentEvent e) {
                search();
            }

            @Override
            public void removeUpdate(final DocumentEvent e) {
                search();
            }

            @Override
            public void changedUpdate(final DocumentEvent e) {
                search();
            }

            private void search() {
                selector.search(filter.getText());
            }
        });

        scrollPane.setPreferredSize(PREFERRED_SIZE);

        frame.add(filter, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
