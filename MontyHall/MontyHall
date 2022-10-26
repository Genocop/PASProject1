import java.io.*;
import java.util.*;

public class MontyHall
{
    //Method to determine win percentage if player DOESN'T switch doors
    public double noSwitchTrial(int trials){
        Random random = new Random();
        int wins = 0;
        
        for(int i = 1; i<=trials; i++){
            int prizeDoor = random.nextInt(3);
            int contestantDoor = random.nextInt(3);
            
            if (contestantDoor == prizeDoor){
                wins++;
            }
        }
        return(1.0 * wins / trials);
    }
    //Method to determine win percentage if player DOES switch doors
    public double switchTrial(int trials){
        int wins = 0;
        Random random = new Random();
        
        for(int i = 1; i<= trials; i++){
            int prize_door = random.nextInt(3);
            int contestant_door = random.nextInt(3);
            int wrong_door = prize_door;
            
            while (wrong_door == prize_door || wrong_door == contestant_door){
                wrong_door = random.nextInt(3);
            }
            
            int alternate_door = 3 - (contestant_door + wrong_door);
            if (alternate_door == prize_door) {
                wins++;
            }
        } 
        return(1.0 * wins / trials);
    }   
}
