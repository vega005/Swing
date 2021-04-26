import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton {

        Button(String title){
        super(title);
        setBackground(Color.cyan);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getBackground()==Color.cyan) setBackground(Color.green);
                else setBackground(Color.cyan);
            }
        });
    }
}
