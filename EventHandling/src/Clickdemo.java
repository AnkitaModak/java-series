import java.awt.*;
import java.awt.event.*;

class Clickdemo extends Frame implements ActionListener {

    Button b = new Button("Click ME");

    Clickdemo() {
        add(b); // adds the button
        b.addActionListener(this);
        setSize(200, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }

    public static void main(String[] args) {
        new Clickdemo();
    }
}
