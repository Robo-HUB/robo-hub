import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: robert
 * Date: 15.04.16
 * Time: 07:44
 * To change this template use File | Settings | File Templates.
 */
public class QuestionCliTest {

  public static void main(String[] args) {
    QuestionsCatalog qc = new QuestionsCatalog();
    qc.loadCatalog("AppLogic/data/test_questions.csv");

    Scanner scanner = new Scanner(System.in, "UTF-8");
    scanner.useLocale(java.util.Locale.US);

    int ansInt = -1;

    while (ansInt != 0) {
      Question q = qc.getNextQuestion();
      boolean isCorrect = q.askQuestion();

      if ( isCorrect ) System.out.println("Richtig!");
      else System.out.println("Nöö!");

      System.out.print("Noch 'ne Frage (y/n)? ");
      String ans = scanner.next();
      ansInt = ((int)ans.charAt(0)-110); //n
    }
  }
}
