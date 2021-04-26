import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikacjaRamca extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new AplikacjaRamca();
    }

    private JTextField textField;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;

    private Button button1;
    private JButton button2;
    private Button button3;

    AplikacjaRamca(){
        super("Wpisz zwierze");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,300,400,300);
        button1 = new Button("Reset");;
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                label4.setText("");

            }
        });
        button2 = new JButton("Close");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        button3 = new Button("Result");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().equalsIgnoreCase("Kundel")){
                    label4.setText("Krzyzowka jamnika i yorka");
                }
                if (textField.getText().equalsIgnoreCase("Muł")){
                    label4.setText("Krzyzowka konia i osła");
                }
            }
        });

        label1 = new JLabel("Muł");
        label1.setBounds(100,20,100,50);
        label2 = new JLabel("Kundel");
        label2.setBounds(200,20,100,50);
        label3 = new JLabel("=");
        label3.setBounds(170,85,100,50);
        label4 = new JLabel("");
        label4.setBounds(210,85,200,50);

        textField = new JTextField();
        textField.setBounds(70,100,80,20);

        JPanel panel = new JPanel(null);
        panel.setBackground(Color.lightGray);
        panel.add(button1);
        button1.setBounds(20,200,100,50);
        panel.add(button2);
        button2.setBounds(250, 200, 100,50);
        panel.add(button3);
        button3.setBounds(135,200,100,50);

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);

        panel.add(textField);

        setContentPane(panel);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
