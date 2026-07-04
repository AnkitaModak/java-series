import java.util.*;
public class TodoList{
    private ArrayList<String>todoList;
    public TodoList(){
        todoList = new ArrayList<>();
    }
    public void add(String task){
        todoList.add(task);
    }
    public void print(){
        for(String s:todoList){
            System.out.println(todoList.indexOf(s)+1 +": "+s);
        }
    }
    public void remove(int number){
        todoList.remove(number-1);
    }
}
