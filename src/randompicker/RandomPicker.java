/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randompicker;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author dener
 */
public class RandomPicker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] boysGifts= {"HotWheels", "Chess Board", "Sodoku", "LEGO", "Basketball", "Playstation", "Xbox", "Drone", "Scooter", "Nintendo Switch", "Football"};
        String [] girlsGifts= {"Barbie Doll", "Magic Sand", "Fairy Wings", "Make-up", "Polly Doll", "My Little Pony", "Play Dooh", "Fairy Cotton Wand", "Cranyons Set", "Peppa Pig Doll", "Dora Doll"};
        
        //Arrays.toString(boysGifts);
        //Arrays.toString(girlsGifts);
        
        Random r1 = new Random();
        Random r2 = new Random();
        
        int idx1 = r1.nextInt(boysGifts.length);
        int idx2 = r2.nextInt(girlsGifts.length);
        
        System.out.println("Boy gift picked: " + boysGifts[idx1] + " \nGirl gift picked: " + girlsGifts[idx2] );
        
    }
    
}
