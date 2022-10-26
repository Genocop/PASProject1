import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Creates MonteHall object and scanner for user input
        MontyHall test = new MontyHall();
        Scanner scanner = new Scanner(System.in);
        
        //Asks for user how many trials they'd like to run and prints results accordingly
        System.out.println("How many trials would you like to run?");
        int trials = scanner.nextInt(); 
        
        System.out.println("Percentage of wins without switching door: " + test.noSwitchTrial(trials));
        System.out.println("Percentage of wins with switching door: " + test.switchTrial(trials));
    }
}
