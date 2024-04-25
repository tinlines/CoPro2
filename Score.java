import java.util.Scanner;
class Grade{
    private double grades;
    public void setGrade(double newGrade) {
        grades = newGrade;
    }
    public double getGrade() {
        grades = grades * (.30);
        return grades;
    }
}
class Score extends Grade{
    private double scores;
    public void setScore(double newScore) {
        scores = newScore; 
    }
    public double getScore() {
        return scores;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Score sc = new Score();
        System.out.print("Enter score: ");
        double input = s.nextDouble();
        sc.setGrade(input);
        sc.setScore(input);
        System.out.println("Score: " + sc.getScore() + "/100");
        System.out.printf("Grade: %.2f/30", sc.getGrade());
        
    }
}
