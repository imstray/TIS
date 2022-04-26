import java.util.*;

public class Display {

    ConsoleOutput output = new ConsoleOutput();
    CSVreader reader = new CSVreader();
    Scanner console = new Scanner(String.valueOf(System.console()));
    String questionBeingAsked = "";
    String correctAnswer = "";

    private List<String> questionsThatHaveBeenAsked = new ArrayList<>();

    public void mainMenu(){
        output.outputString("Hello and welcome!");
        output.outputString("This is 'Who Wants To Be A Somervillionare'");
        output.outputString("Would you like to play?");
    }

    public String showAQuestion(){
        boolean aQuestionHasBeenAsked = false;
        while(!aQuestionHasBeenAsked){
        for(Map.Entry<String, List<String>> entry:reader.theQuestionsAndAnswers.entrySet()){
            String question = entry.getKey();
            List<String> answers = entry.getValue();
            if(randomBoolean()){
                if(!questionsThatHaveBeenAsked.contains(question)){
                    output.outputString(question);
                    questionsThatHaveBeenAsked.add(question);
                    aQuestionHasBeenAsked = true;
                    questionBeingAsked = question;
                    int indexOfCorrectAnswer= Integer.parseInt(answers.get(answers.size()-1));
                    correctAnswer = answers.get(indexOfCorrectAnswer);
                    setCorrectAnswer(correctAnswer);
                    return question;
            }
            }

        }
    }
        return null;
    }

    public void showTheAnswerOptions(String questionAsked){
        for(Map.Entry<String, List<String>> entry:reader.theQuestionsAndAnswers.entrySet()){
            String question = entry.getKey();
            List<String> answers = entry.getValue();
            if(question.equals(questionAsked)){
                for(int i=0;i<4;i++){
                    output.outputString(answers.get(i));
                }
            }
        }
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean randomBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }

    public static void main(String[] args) {
        Display d = new Display();
        d.showTheAnswerOptions(d.showAQuestion());
        System.out.println(d.correctAnswer);

    }
}
