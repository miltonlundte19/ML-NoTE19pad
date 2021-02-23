import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Notpadclone {

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem, menuItemNew;

    private JTextArea textArea1;
    private JPanel panel1;
    private JButton clerbutton;

    private String filnam;
    public Notpadclone() {
        menuBar = new JMenuBar();

        menu = new JMenu("File");
        menuBar.add(menu);

        menuItemNew = new JMenuItem("New");
        menuItemNew.addActionListener(new NullAL());
        menu.add(menuItemNew);

        menuItem = new JMenuItem("Loud");
        menuItem.addActionListener(new LoudAL());
        menu.add(menuItem);

        menu = new JMenu("Save");
        menuBar.add(menu);

        menuItem = new JMenuItem("Save");
        menuItem.addActionListener(new SaveAL());
        menu.add(menuItem);

        menuItem = new JMenuItem("Save Ass");
        menu.add(menuItem);


        clerbutton.addActionListener(new NullAL());
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

    private class NullAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea1.setText("");
        }
    }
    private class LoudAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser filcho = new JFileChooser();
            int result = filcho.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                filnam = filcho.getSelectedFile().getAbsolutePath();
            } else {
                filnam = "exempel.txt";
            }
            FileReader fr = null;
            try {
                fr = new FileReader(filnam);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        }
    }

    private class SaveAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
