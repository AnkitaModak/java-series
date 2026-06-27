import java.awt.*;
import java.awt.event.*;
public class MouseDemo extends Frame implements MouseListener{
    MouseDemo(){
        addMouseListener(this);
        setSize(200,300);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("i clicked the mouse");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("mouse toucheddd");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse released");
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("mouse entered");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("mouse exited");
    }
    public static void main(String[] args){
        new MouseDemo();
    }

}
