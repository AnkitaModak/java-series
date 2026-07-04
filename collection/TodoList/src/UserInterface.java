import java.util.*;
public class UserInterface {
    private Scanner sc;
    private TodoList list;
    public UserInterface(TodoList list,Scanner sc){
        this.list = list;
        this.sc = sc;
    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String word = sc.nextLine();
            if(word.equalsIgnoreCase("stop")){
                break;
            }
            if(word.equalsIgnoreCase("add")){
                System.out.print("To add: ");
                String item = sc.nextLine();
                list.add(item);
            }
            if(word.equalsIgnoreCase("list")){
                list.print();
    }
    if(word.equalsIgnoreCase("remove")){
                if(list.isEmpty()) {
                  System.out.println("list is empty!");
                  continue;
                }else{
                  System.out.print("Which one is removed? ");
                  int num = sc.nextInt();
                  list.remove(num);
                }
            }
        }
}
}
