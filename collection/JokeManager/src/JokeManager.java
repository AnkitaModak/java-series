import java.util.*;
public class JokeManager {
    private ArrayList<String> JokeManager;
    public JokeManager(){
        JokeManager = new ArrayList<>();
    }
    public void addJoke(String joke){
        JokeManager.add(joke);
    }
    public String drawJoke(){
        if(JokeManager.isEmpty()) return "Jokes are in short supply.";
        else{
            Random rand = new Random();
            int randomIndex = rand.nextInt(JokeManager.size());
            String joke = JokeManager.get(randomIndex);
            return joke;
        }
    }
    public void printJokes(){
        for(String joke:JokeManager){
            System.out.println(joke);
        }
    }
}
