
public class NewStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = "This is a string";
		myString = myString + ", and this is more";
		myString = myString + " \u00a9 2018";
		System.out.println(myString);
		
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println("The result is: " + numberString);
		
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println(lastString);
		
		double doubleNumber = 120.47;
		lastString = lastString + doubleNumber;
		System.out.println("the result is " + lastString);
				
	}

}
