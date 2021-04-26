import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplikacja extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new Aplikacja();
    }
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private Button button4;
    private JButton button5;

    Aplikacja(){
        super("Wybierz osobe");
        setBounds(230,230, 400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("Osoba 1");
        button2 = new JButton("Osoba 2");
        button3 = new JButton("Osoba 3");
        button4 = new Button("Reset ");
        button5 = new JButton("Zamknij");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Name: Bruce Lee");
                label1.setBounds(40,15,150,100);
                label2.setText("Age: " + 33);
                label2.setBounds(180,15,150,100);
                label3.setText("Height: " + 172);
                label3.setBounds(260,15,150,100);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Name: Chuck Norris");
                label1.setBounds(40,15,150,100);
                label2.setText("Age: " + 81);
                label2.setBounds(180,15,150,100);
                label3.setText("Height: " + 176);
                label3.setBounds(260,15,150,100);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Name: Jackie Chan");
                label1.setBounds(40,15,150,100);
                label2.setText("Age: " + 67);
                label2.setBounds(180,15,150,100);
                label3.setText("Height: " + 174);
                label3.setBounds(260,15,150,100);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("");
                label2.setText("");
                label3.setText("");

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel panel = new JPanel(null);
        panel.setBackground(Color.GRAY);
        panel.add(button1);
        button1.setBounds(20,120,100,50);
        panel.add(button2);
        button2.setBounds(130,120,100,50);
        panel.add(button3);
        button3.setBounds(240,120,100,50);
        panel.add(button4);
        button4.setBounds(75,200,100,50);
        panel.add(button5);
        button5.setBounds(180,200,100,50);

        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        setContentPane(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
