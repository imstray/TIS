import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Display d = new Display();
        Scanner keyboard = new Scanner(System.in);
        d.showTheAnswerOptions(d.showAQuestion());
        if(keyboard.nextLine().equals(d.correctAnswer)){
            System.out.println("correct");
        }else{
            System.out.println("incorrect");
        }
    }
}
