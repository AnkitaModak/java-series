import java.util.*;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    public TextUI(Scanner sc,SimpleDictionary dict ){
        this.scanner = sc;
        this.dict = dict;
    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String word = scanner.nextLine();
            if(word.equalsIgnoreCase("end")){
                break;
            }else if(word.equalsIgnoreCase("add")){
                System.out.print("Word: ");
                String str = scanner.nextLine();
                System.out.print("Translation: ");
                String trans = scanner.nextLine();
                dict.add(str,trans);
            }else if(word.equalsIgnoreCase("search")){
                System.out.print("To be translated: ");
                String search = scanner.nextLine();
                if(dict.translate(search) == null) System.out.println("Word "+search +" was not found");
                else System.out.println(dict.translate(search));


            }else{
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
}
