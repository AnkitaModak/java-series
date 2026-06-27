import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Frame implements KeyListener {
    KeyDemo(){
        addKeyListener(this);
        setSize(200,200);
        setVisible(true);
    }
    public void keyTyped(KeyEvent e){
        System.out.println("key typeddd!");
    }
    public void keyPressed(KeyEvent e){
        System.out.println("key pressed!");
    }
    public void keyReleased(KeyEvent e){
        System.out.println("key released!");
    }
    public static void main(String[] args){
        new KeyDemo();
    }
}
