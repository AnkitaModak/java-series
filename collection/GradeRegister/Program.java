
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        UserInterface UI = new UserInterface(register,scanner);
        UI.start();
    }
}
