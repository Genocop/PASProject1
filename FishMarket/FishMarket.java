import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FishMarket {
    Random random = new Random();
    ArrayList<Seafood> seafoodList = new ArrayList<>();

    public void populateList() {
        //Loops 300  times since we want 300 seafoods
        for(int i = 1; i <= 300; i++) {
            int randomVariable = random.nextInt(4); //creates the random variable to determine which of the 4 seafood it is.
            double randomScallopWeight = (1.0) * random.nextDouble(); 
            double randomShrimpWeight = (0.33) * random.nextDouble();
            double randomCrabWeight = (3.0) * random.nextDouble();
            double randomFishWeight = (50.0) * random.nextDouble();

            switch(randomVariable) {
                case 1: randomVariable = 1; 
                    Scallop scallop = new Scallop(i, "Scallop", randomScallopWeight, 0.656);
                    seafoodList.add(scallop);
                    break;
                case 2: randomVariable = 2;
                    Shrimp shrimp = new Shrimp(i, "Shrimp", randomShrimpWeight, 1.220);
                    seafoodList.add(shrimp);
                    break;
                case 3: randomVariable = 3;
                    Crab crab = new Crab(i, "Crab", randomCrabWeight, 3.050);
                    seafoodList.add(crab);
                    break;
                case 4: randomVariable = 4;
                    Fish fish = new Fish(i, "Fish", randomFishWeight, 2.405);
                    seafoodList.add(fish);
                    break;    

            }
        }
  
    }
    
    public void simulateFishMarket() {
        populateList();
        writeFile();
    }

    public void writeFile() {
        try {
            FileWriter file = new FileWriter("FishMarket.csv");
            
            PrintWriter writer = new PrintWriter(file);
            
            writer.print("Index");
            writer.print(",");
            writer.print("Type");
            writer.print(",");
            writer.print("Weight");
            writer.print(",");
            writer.print("Price");
            writer.print(",\n");
                            
            
            for(Seafood list : seafoodList) {
                writer.println(list);
            }
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void load() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("FishMarket.csv"));
        ArrayList<String[]> inputtedData = new ArrayList<>();
        String[] input;
        while (scanner.hasNext()) {
            input = scanner.nextLine().split(",");
            inputtedData.add(input);
        }

        for(String[] temp : inputtedData) {
            for(String a : temp) {
                System.out.println(a + "\t");
            }
            System.out.println("\n");

        }
    }

}   
