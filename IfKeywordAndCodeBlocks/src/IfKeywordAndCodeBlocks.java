
public class IfKeywordAndCodeBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		
		
		
		
//		if(score < 5000 && score >1000) {
//			System.out.println("your score was less than 5000 but greater than 1000");
//		} else if(score<1000) {
//			System.out.println("you score was less than 1000");
//		} else {
//			System.out.println("got here");
//		}
		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("your final score was " + finalScore);
			
		}
		
		score = 10000;
		levelCompleted = 0;
		bonus = 200;
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("your final score was " + finalScore);
			
		}
		
	}
	public static void calculateScore() {
		
	}
}

		