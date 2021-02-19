import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notpadclone {

    private JMenuBar menuBar;
    private JMenu menu, file, save;
    private JMenuItem menuItem, menuItemNew, menunew, menuloud, menusave, menusaveass;

    private JTextArea textArea1;
    private JPanel panel1;
    private JButton clerbutton;

    public Notpadclone() {
        file = new JMenu("File");
        save = new JMenu("Save");
        menunew = new JMenuItem("New");
        menuloud = new JMenuItem("Loud");
        menusave = new JMenuItem("Save");
        menusaveass = new JMenuItem("Save Ass");
        menunew.addActionListener();
        menuBar = new JMenuBar();

        menu = new JMenu("File");
        menuBar.add(menu);

        menuItemNew = new JMenuItem("New");
        menu.add(menuItemNew);

        menuItem = new JMenuItem("Loud");
        menu.add(menuItem);

        menu = new JMenu("Save");
        menuBar.add(menu);

        menuItem = new JMenuItem("Save");
        menu.add(menuItem);

        menuItem = new JMenuItem("Save Ass");
        menu.add(menuItem);


        clerbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notpadclone");
        Notpadclone gui = new Notpadclone();
        frame.setContentPane(gui.panel1);
        frame.setJMenuBar(gui.menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
