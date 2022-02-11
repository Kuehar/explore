package explore;

public class Main {
	public static void main(String[] args) {
		
		/*
		int myVariable = 50;
		myVariable++;
		myVariable--;
		System.out.println("This is a test.");
		
		System.out.println("This is " +
				"another"+
				"still more.");
		
		System.out.println(myVariable);
		*/		
		
		int newScore = calculateScore("Tom", 500);
		int unnamedScore = calculateScore(200);
		System.out.println("New score is " + newScore);
		System.out.println("Unnamed score is " + unnamedScore);
		
	}
	
	// base method
	public static int calculateScore(String playerName,int score) {
		System.out.println("Player " + playerName + "scored " + score + " points");
		return score * 1000;
	}
	
	// overload method
	public static int calculateScore(int score) {
		System.out.println("Unnamed scored " + score + " points");
		return score * 1000;
	}
	
	
	public static void PositiveNegativeZero(int num) {
		if(num == 0) {
			System.out.println("Zero");
		}else if(num > 0) {
			System.out.println("Positive");
		}else {
			System.out.println("Negative");
		}
	}
}
