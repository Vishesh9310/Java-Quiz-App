public class Question {
    private String question;
    private String[] options;
    private int correctOption;
    private Difficulty difficulty;

    public Question(String question, String[] options, int correctOption, Difficulty difficulty){
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
        this.difficulty = difficulty;
    }

    public String getQuestion(){
        return question;
    }

    public String[] getOptions(){
        return options;
    }

    public int getCorrectOption(){
        return correctOption;
    }

    public Difficulty getDifficulty(){
        return difficulty;
    }
}
