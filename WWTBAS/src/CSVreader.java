import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class CSVreader {
    QnAHandler QnAs = new QnAHandler();

    public static void main(String[] args) {
        QnAHandler QnAs = new QnAHandler();
        for(String[] thing: QnAs.getQuestionsAndAnswers()){
            System.out.println(Arrays.toString(thing));
        }
    }
}

