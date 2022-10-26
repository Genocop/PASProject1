import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Test{

public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	//Asks for user for number of people
	System.out.println("Enter Number of People");
	int numOfPeople = scan.nextInt();
	//Asks user for number of runs
	System.out.println("Enter Number of Runs"); 
	int numOfRuns = scan.nextInt();
	//Create a new object b of class Birthday and fill with parameters scanned in above
	Birthday b = new Birthday(numOfRuns, numOfPeople);
	b.conductTrial();	
	
}
}
