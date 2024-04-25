import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your score: ");
		double input = s.nextDouble();
		Score sc = new Score();
		sc.setGrade(input);
		sc.setScore(input);
		System.out.println("Score: " + sc.getScore() + "/100");
		System.out.printf("Grade: %.2f/30", sc.getGrade());
	}

}
class Grade{
	private double grades;
	public void setGrade(double newGrade) {
		grades = newGrade;
	}
	public double getGrade() {
		grades = grades * 30 / 100;
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
}
