import java.util.*;
public class UserInterface {
    private JokeManager manager;
    private Scanner sc;
    public UserInterface(JokeManager manager,Scanner sc){
        this.manager = manager;
        this.sc = sc;
    }
    public void start(){
        while(true){
            System.out.println("Commands:\r\n" + //
                            "1 - add a joke\r\n" + //
                            "2 - draw a joke\r\n" + //
                            "3 - list jokes\r\n" + //
                            "X - stop");
            String command = sc.nextLine();
            if(command.equals("1")){
                System.out.println("Write the joke to be added:");
                manager.addJoke(sc.nextLine());
            }else if(command.equals("2")){
                System.out.println(manager.drawJoke());
            }
            else if(command.equals("3")){
                manager.printJokes();
            }else if(command.equalsIgnoreCase("X")){
                break;
            }
        }
    }
}
