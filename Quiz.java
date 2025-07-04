import java.util.*;

public class Quiz {
    private List<Question> questions;
    private int score;
    private int correct;
    private int incorrect;
    private int skipped;
    private String username;

    public Quiz(String username){
        this.username = username;
        this.questions = new ArrayList<>();
        this.score = 0;
        this.correct = 0;
        this.incorrect = 0;
        this.skipped = 0;
        loadQuestion();
        Collections.shuffle(questions); //for random questions
    }

    private void loadQuestion() {
        questions.add(new Question("Capital of Japan?", new String[]{"1. Tokyo", "2. Beijing", "3. Seoul", "4. Bangkok"}, 1, Difficulty.EASY));
        questions.add(new Question("2 * 6 + 3 = ?", new String[]{"1. 15", "2. 12", "3. 9", "4. 18"}, 1, Difficulty.EASY));
        questions.add(new Question("Java keyword for inheritance?", new String[]{"1. implement", "2. extends", "3. inherits", "4. override"}, 2, Difficulty.MEDIUM));
        questions.add(new Question("What is a thread-safe collection?", new String[]{"1. ArrayList", "2. HashMap", "3. Vector", "4. TreeMap"}, 3, Difficulty.MEDIUM));
        questions.add(new Question("Time complexity of binary search?", new String[]{"1. O(n)", "2. O(log n)", "3. O(n log n)", "4. O(1)"}, 2, Difficulty.HARD));
    }

    private int getPoints(Difficulty d){
        int points = 0;
        switch(d){
            case EASY:
            points = 5;
            break;
            case MEDIUM:
            points = 10;
            break;
            case HARD:
            points = 15;
            break;
        }
        return points;
    }

    public void startQuiz(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quiz Starting for " + username + "\n");

        for(Question q : questions){
            System.out.println(q.getQuestion() + "[" + q.getDifficulty() + "]");
            for(String option : q.getOptions()){
                System.out.println(option);
            }

            System.out.println("You have 10 seconds to answer (or type 0 to skip): ");
            long start = System.currentTimeMillis();
            
            int ans = -1;
            while((System.currentTimeMillis() - start) < 10000){
                if(sc.hasNextInt()){
                    ans = sc.nextInt();
                    break;
                }
            }
            if(ans == -1 || ans == 0){
                System.out.println("Time up or skipped!");
                skipped++;
                continue;
            }
            if(ans == q.getCorrectOption()){
                System.out.println("Correct");
                score += getPoints(q.getDifficulty());
                correct++;
            }else{
                System.out.println("Incorrect! Correct Answer: Option "+ q.getCorrectOption());
                incorrect++;
            }
            System.out.println();
        }
        showResult();
        sc.close();
    }

    private void showResult() {
        System.out.println("\nQuiz Summary for " + username);
        System.out.println("Correct Answers: " + correct);
        System.out.println("Incorrect Answers: " + incorrect);
        System.out.println("Skipped Questions: " + skipped);
        System.out.println("Total Score: " + score);
    }
}
