import java.util.ArrayList;
import java.util.Random;

public class Birthday {
    private ArrayList<Person> list;
    private double numofTrials;
    private int numofPeople;
    private double match = 0;
       
    public Birthday(int numofTrials, int numofPeople){
        this.numofPeople = numofPeople;
        this.numofTrials = numofTrials;
        list = new ArrayList<Person>();
    }
        
    //Gets number of people (from user)  
        
    public int getnumofPeople() {
            return numofPeople;
    }
    //Gets list of People
    public void getList() {
            for(int i= 0; i < list.size(); i++) {
                System.out.println(list.get(i).getDay()+ " ");
            }
    }
        //Generates random birthdays and assigns them to People
    public void genRandomBirthdays() {
            Random rand = new Random();
            for(int i = 0; i < numofPeople; i++) {
                list.add(new Person(rand.nextInt(365) + 1));
            }
    }
        //Starts the simulation
    public void conductTrial() {
            for(int i = 0; i < numofTrials; i ++) {
                genRandomBirthdays();
                getList();
                //Runs nested loop until there is a birthday match and then it breaks
                loop:
                    for(int j = 0 ; j < list.size(); j ++){
                        for(int x = j + 1; x < list.size(); x++) {
                            if(list.get(j).getDay() == list.get(x).getDay()) {
                                list.clear();
                                match += 1;
                                break loop;
                           }
                        }
                    }
                list.clear();
            }
        twoString();
    }
    
    public void twoString() {
        System.out.println("Trials: " + numofTrials  + "\n People: "+ numofPeople+"\n People Matched:" + match /numofTrials +"%");
    }
}
