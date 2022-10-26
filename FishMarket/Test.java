import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) throws FileNotFoundException { //this FileNotFoundException required to remove errors. (recommended from eclipse)
        
        FishMarket run = new FishMarket(); //creates the FishMarket object.
        run.simulateFishMarket(); //runs the method that runs the simulation for the FishMarket.
        run.load(); //will run and load the csv file from the simulated data.

    }
}

