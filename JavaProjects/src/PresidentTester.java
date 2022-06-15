import java.util.Scanner;
public class PresidentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] presidents = {"George Washington", "John Adams", "Thomas Jefferson", "James Madison", "James Monroe", "John Quincy Adams", "Andrew Jackson", "Martin Van Buren", "William Henry Harrison", "John Tyler", "James K. Polk", "Zachary Taylor", "Millard Fillmore", "Franklin Pierce", "James Buchanan", "Abraham Lincoln", "Andrew Johnson", "Ulysses S. Grant", "Rutherford B. Hayes", "James A. Garfield", "Chester A. Arthur", "Grover Cleveland", "Benjamin Harrison", "Grover Cleveland", "William McKinley", "Theodore Roosevelt", "William Howard Taft", "Woodrow Wilson", "Warren G. Harding", "Calvin Coolidge", "Herbert Hoover", "Franklin D. Roosevelt", "Harry S. Truman", "Dwight D. Eisenhower", "John F. Kennedy", "Lyndon B. Johnson", "Richard M. Nixon", "Gerald R. Ford", "Jimmy Carter", "Ronald Reagan", "George Bush", "Bill Clinton", "George W. Bush", "Barack Obama", "Donald Trump", "Joe Biden"};
//		System.out.println("(1) List the Presidents");
//		System.out.println("(2) Guess the Following President");
//		System.out.println("(3) Guess the Preceding President");
//		System.out.println("(4) Guess the President Given Number");
//		System.out.println("(4) Guess the Number Given President");
//		
//	
//		System.out.print("Add L to the Game Mode for LastNameOnlyMode");
//		
//	
//	System.out.println();
//	System.out.print("GAME MODE: ");
		
		Scanner scan = new Scanner(System.in);
		for(String president: presidents) {
			
			System.out.print("Enter President: ");
			if(scan.nextLine().equals(president)) {
				continue;
			} else {
				break;
			}
			
			
		}
		System.out.println("GAME OVER!!!!!");
	
	
		
		
		
	}

}
