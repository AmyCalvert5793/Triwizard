/*
Amy Calvert
CS 202
Methods Used in Game Play
rollDie()-
draw()-
 */
package finalproject;

import java.util.Random;
import java.util.Scanner;


public class GamePlay extends Grid{
    

    
    
@Override
public int rollDie(){
    Random r = new Random();
    
    int DieRoll = r.nextInt(6) + 1;
    System.out.print(DieRoll);
    return DieRoll;
}

@Override
public String writeRollDie(){
    
    String Message = "You Rolled a " + rollDie();
    return Message;
}
    
    
    

    public String draw(){
        //generate random number
        Random r = new Random();
            
            int cardNum = r.nextInt(24) + 1;
            
            String Draw;
        
            if(cardNum == 1){
                Draw ="Stupefy! \n Next player loses a turn";
            }
            else if(cardNum == 2){
                Draw = "You Tripped On A Root! \n Move Back 1 Space";
            }
            else if(cardNum == 3){
                Draw = "Polyjuice Potion! \n Switch One of Your Movers With \n An Opponent's Mover On The Game Board";
            }
            else if (cardNum == 4){
                Draw = "Blind A Dragon With \n The Conjunctivitis Curse!\n Move Forward 2 Spaces!";  
            }
            else if (cardNum == 5){
                Draw = "A Blast-Ended Swrewt Attacks! \n Move Back 2 Spaces";
            }
            else if (cardNum == 6){
                Draw = "Patronus Charm : \n Defeat A Dementor!  \n Move Forward 2 Spaces";
            }
            else if (cardNum == 7){
                Draw = "Imperious Curse! \n Move Another Player's \n Mover Anywhere On The Gameboard";
            }
            else if (cardNum == 8){
                Draw = "Hide In The Maze! \n Lose A Turn";
            }
            else if (cardNum == 9){
                Draw = "Find A Shortcut! \n Take Another Turn";
            }
            else if (cardNum == 10){
                Draw = "Find A Portkey! \n Move One of Your Movers To Any \n Open Space On The Game Board";
            }
            else if (cardNum == 11){
                Draw = "Maze Bush Attacks! \n Move Back 1 Space";
            }
            else if (cardNum == 12){
                Draw = "Golden Mist Turns Everything Upside Down \n" +
                      "Remove One Of Your Movers From Start And \n Place On Your Maze Entry Space";
            }
            else if (cardNum == 13){
                Draw = "Maze Changes Formation!  \n Remove One Of Your Movers From Start \n" +
                      "And Place On Your Maze Entry Space";
            }
            else if (cardNum == 14){
                Draw = "Boggart Blocks Your Path! \n Move Back 2 Spaces";
            }
            else if (cardNum == 15){
                Draw = "Maze Changes Formation \n In Your Favor! \n Take Another Turn";
            }
            else if (cardNum == 16){
                Draw = "Make A Wrong Turn! \n Move Back 2 Spaces";
            }
            else if (cardNum == 17){
                Draw = "Mad-Eye Moody's Magical Eye \n Helps You Avoid Obstacles! \n Take Another Turn";
            }
            else if (cardNum == 18){
                Draw = "Accio Broomstick! \n Take Another Turn";
            }
            else if (cardNum == 19){
                Draw = "Lumos! Your Path Is\n  Illuminated!  \nMove Forward 1 Space";
            }
            else if (cardNum == 20){
                Draw = "Defeat An Acromantula! \n Place One Of Your Movers \n On Your Home Row";
            }
            else if (cardNum == 21){
                Draw = "Expelliarmus! \n Move Another Player's Mover \n Anywhere On The Game Board";
            }
            else if (cardNum == 22){
                Draw = "Wind Gust Reveals A Shortcut! \n Move Forward 3 Spaces";
            }
            else if (cardNum == 23){
                Draw = "You Have Solved A Riddle \n From The Sphinx! \n Move Forward 1 Space";
            }
            else if (cardNum == 24){
                Draw = "Cruciatus Curse! \n Move One Of Your Movers \n Back To Start";
            }
            else{
                Draw = "Avada Kedavra! \n There Was An Error! \n Try Again";
            }
       return Draw;
    }   

}
