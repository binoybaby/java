
public class NewOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 1 + 2;
		System.out.println("1 + 2 = " +result);
		
		int previousResult = result;
		result = result - 1;
		System.out.println(previousResult + " - 1 = " + result);
		
		previousResult = result;
		result = result * 10;
		System.out.println(previousResult + " * 10 = " + result);
		
		previousResult = result;
		result = result / 5;
		System.out.println(previousResult + " / 5 = " + result);
		
		previousResult = result;
		result = result % 3;
		System.out.println(previousResult + " % 3 = " + result);
		
		previousResult = result;
		result ++ ;
		System.out.println(previousResult + " + 1 = " + result);
		
		previousResult = result;
		result -- ;
		System.out.println(previousResult + " - 1 = " + result);
		
		previousResult = result;
		result += 2;
		System.out.println("Result is now = " + result);
		
		previousResult = result;
		result *=10 ;
		System.out.println("Result is now = " + result);
		
		previousResult = result;
		result /=10 ;
		System.out.println("Result is now = " + result);
		
		previousResult = result;
		result ++ ;
		System.out.println("Result is now = " + result);
		
		boolean isAlien = false;
		if (isAlien == false)
			System.out.println("It is not an Alien");
		
		int topScore = 80;
		if (topScore < 100)
			System.out.println("You got the high score");
		
		int secondTopScore = 60;
		if ((topScore > secondTopScore) && (topScore < 100))
			System.out.println("Greater than top score and less than 100");
		
		if ((topScore > 90) || (secondTopScore < 100))
			System.out.println("One of these tests is true");
		
		int newValue = 50;
		if (newValue == 50)
			System.out.println("This is an error");
		
		boolean isCar = false;
		if(isCar==true)
			System.out.println("this is not supposed to happen");
		
		boolean wasCar = isCar ? true : false;
		if (wasCar)
		System.out.println("wasCar is true");
		
		double a = 20d, b=80d;
		double c = 25 * (a+b);
		double d = (a+b);
		d = (d % 40);
		System.out.println("(a + b) * 25 =" + c);
		System.out.println("remainder of (a + b) / 40 = " + d);	
		
		if (d<=20);
		System.out.println("total was over the limit.");
			
		
	}

}
