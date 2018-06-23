package hwk10;

public class Student extends Person {

	private double score;

	public Student() {

	}

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		}

	}

	public void showStudentInfo() {
		super.showPersonInfo();
		System.out.println("score: " + this.getScore());
	}

}
