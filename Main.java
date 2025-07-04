import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Welcom to the Java Quiz App!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        Quiz quiz = new Quiz(name);
        quiz.startQuiz();
    }
}