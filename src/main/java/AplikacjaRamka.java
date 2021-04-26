import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikacjaRamka extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new AplikacjaRamka();
    }

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    JButton button1;
    JButton button2;

    AplikacjaRamka(){
        super("Dodawanie");
        setBounds(150,150,350,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("Wyczysc");
        button2 = new JButton("Dodaj");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();
                int liczba1 = Integer.parseInt(text1);
                int liczba2 = Integer.parseInt(text2);
                int wynik = liczba1 + liczba2;
                label3.setText(""+wynik);
            }
        });

        JPanel panel = new JPanel(null);
        panel.setBackground(Color.CYAN);
        button1.setBounds(80,150,100,20);
        button2.setBounds(185,150,100,20);

        label1 = new JLabel("+");
        label2 = new JLabel("=");
        label3 = new JLabel("");
        label1.setBounds(135,70,20,20);
        label2.setBounds(200,70,20,20);
        label3.setBounds(220,65,30,30);

        textField1 = new JTextField();
        textField1.setBounds(90,65,30,30);
        textField2 = new JTextField();
        textField2.setBounds(160,65,30,30);

        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(label3);

        setContentPane(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
