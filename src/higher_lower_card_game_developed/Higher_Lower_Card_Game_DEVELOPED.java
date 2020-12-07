//Make a higher or lower card game 
//
//1. Gives the user a random card 
//2. They have to choose whether the next card is going to be higher or lower 
//3. If they get it correct then they get a point 
//4. If they get it wrong then they loose one of there 3 lives 
//5. They have 15 rounds 
//6. They are gievn the option to play again when the round is over or when they die 
//7. If the user and the Computer have the same number card, they will play rock paper scissors to decide the winner 

package higher_lower_card_game_developed;

import java.util.Scanner;
import java.util.Random; 


public class Higher_Lower_Card_Game_DEVELOPED {
    
    
    
    public static void formalities(){
        System.out.println("Welcome to higher or lower");
        System.out.println("You will be given a card and you will have to choose whether the next numkber is higher or lower"); 
        System.out.println("In this game, aces a 1's, jacks are 11's, queens are 12's and kings are 13's ");
        System.out.println("You will have three lives");
        System.out.println("You have 15 rounds"); 
        System.out.println("You will get a point if you win"); 
        System.out.println(""); 
        System.out.println("If you have the same number card as the stack, you will play rock, paper, scissors to decide what will happen next...");
        System.out.println("If you win the minigame, the game will contine BUT if you loose, you die!");
        System.out.println("");        
        System.out.println("GOOD LUCK"); 
        System.out.println("");
        System.out.println("");
    }
    

    public static void main(String[] args) {
        formalities(); 
        game();     
    }

    public static void game(){

        Scanner input = new Scanner(System.in); 
        
        int score = 0;
        int lives = 0; 
        int round = 0; 
        
        while(lives<3 && round<15){
            try{
                Random rand = new Random(); 
                int max = 13;
                int min = 1; 
                int playerCard = rand.nextInt((max - min)+1)+min;   
                int computerCard = rand.nextInt((max - min)+1)+min; 
                
                if(playerCard == 1){
                    System.out.println("Your card is... ACE(1)"); 
                }
                
                if(playerCard == 11){
                    System.out.println("Your card is... JACK(11) ");
                }
                
                if(playerCard == 12){
                    System.out.println("Your card is... QUEEN(12)");
                }
                
                if(playerCard == 13){
                    System.out.println("Your card is... KING(13)"); 
                }
                
                else{
                    System.out.println("Your card is... " + playerCard); 
                }
                
                System.out.println(""); 
                System.out.println("Higher or Lower");
                String HorL = input.next(); 
                
                if(HorL.equalsIgnoreCase("Higher")){
                    if(computerCard > playerCard){
                        System.out.println(""); 
                        System.out.println("Well done, thats correct");
                        score = score + 1; 
                        round = round + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score); 
                        System.out.println("");
                    }
                    if(computerCard < playerCard){
                        System.out.println("");
                        System.out.println("Sorry, that was wrong");
                        System.out.println("You have lost a life");
                        round = round + 1;
                        lives = lives + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score);
                        System.out.println("");
                    }
                    
                    
                    if(computerCard == playerCard){
                        System.out.println("");
                        System.out.println("They are the same"); 
                        System.out.println("Nothing happens here");
                        round = round + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score);
                        System.out.println("");
                    }
                    
                }
                
                if(HorL.equalsIgnoreCase("lower")){
                    if(computerCard < playerCard){
                        System.out.println(""); 
                        System.out.println("Well done, thats correct"); 
                        score = score + 1; 
                        round = round + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score); 
                        System.out.println("");
                    }
                    if(computerCard > playerCard){
                        System.out.println(""); 
                        System.out.println("This is wrong");
                        System.out.println("You have lost a life"); 
                        round = round + 1;
                        lives = lives + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score); 
                        System.out.println("");
                    }
                    if(computerCard == playerCard){
                        decide(); 
                        round = round + 1; 
                        System.out.println("");
                        System.out.println("Your score is ... " + score); 
                        System.out.println("");
                    }
                }
                
                
                if(lives == 3){
                    endLives(); 
                    System.out.println(score); 
                    
                    playAgain();
                    
                }
                
                if(round == 15){
                    endRound(); 
                    System.out.println(score); 
                    
                    playAgain(); 
                }
                  
 
            }
            catch(Exception e){
                System.out.println("ERROR: e"); 
            }
        } 

    }
    
    
    
    public static void endLives(){
           System.out.println("You have used all of your lives!!");
           System.out.println("You have played well!");
           System.out.println("THANK YOU FOR PLAYING!"); 
           System.out.println("");
           System.out.println("Your final score was:");
    }
    
    
    
    public static void endRound(){
        System.out.println("WELL DONE!!");
        System.out.println("You have completed the game with out dying");
        System.out.println("You survived all 15 rounds");
        System.out.println("Your final score is:"); 
    }
    
    
    
    public static void playAgain(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Would you like to play again?? Yes or No?");
        String again = input.next();
        
        if(again.equalsIgnoreCase("No")){
            System.out.println("");
            System.out.println("Okay, bye!");
        }
        else{
            System.out.println(""); 
            game(); 
        }

    }
    
    public static void decide(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); 
        
        System.out.println("");
        System.out.println("You will play ROCK PAPER SCISSORS to decide whether you die or not");
        System.out.println(""); 
        
        boolean play = true;

        while(play == true){
            try{
                System.out.println("Press 1 to hear the rules, Press 2 to play the mini game");
                int option = input.nextInt(); 
                
                switch(option){
                    case(1):
                        case1(); 
                        play = true;
                        break; 
                    
                    case(2):
                        case2();
                        break; 
                }
 
            }
            catch(Exception e){
                System.out.println("ERROR: " + e); 
            }
   
        }
        
    }
    
    
    public static void case1(){
        System.out.println("");
        System.out.println("Here are the rules of the minigame:");
        System.out.println("There will be 3 rounds");
        System.out.println("In each round you will be asked to select either rock, paper, scissors");
        System.out.println("The computer will be doing the same thing at the same time"); 
        System.out.println("");
        System.out.println("Rock beats scissors");
        System.out.println("Paper beats rock");
        System.out.println("Scissors beats paper"); 
    }
    
    
    public static void case2(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); 
        
        boolean play = true;
        int turns = 0; 
        int playerScore = 0; 
        int computerScore = 0; 
        
        while(play == true && turns < 3){
                        int max = 3;
                        int min = 1;
                        int random = rand.nextInt((max-min)+1)+min; 
                 
                        if(random == 1){
                            String computerGo = "Rock"; 
                        } 
                        if(random == 2){
                            String computerGo = "Paper"; 
                        }
                        if(random == 3){
                            String computerGo = "Scissors";  
                        }
                        
                        
                        System.out.println(""); 
                        System.out.println("Rock, Paper, Scissors:");
                        String playerGo = input.next(); 
        
                        
                 //Both select rock: 
                 if(playerGo.equalsIgnoreCase("rock")){
                     if(random == 1){
                         System.out.println("the computer also chose Rock!");
                         System.out.println(""); 
                         play = true; 
                          
                     }
                 }
                 
                 //Both select paper: 
                 if(playerGo.equalsIgnoreCase("paper")){
                     if(random == 2){
                         System.out.println("the computer also chose Paper!");
                         System.out.println(""); 
                         play = true;
                     }
                 }
                 
                 //Both select scissors: 
                 if(playerGo.equalsIgnoreCase("scissors")){
                     if(random == 3){
                         System.out.println("the computer also chose Scissors!");
                         System.out.println("");  
                         play = true;
                     }
                 }
                 
                 //Player selects rock, computer chooses scissors: 
                 if(playerGo.equalsIgnoreCase("rock")){
                     if(random == 3){
                         System.out.println("the computer chose Scissors!");
                         System.out.println("Rock blunts Scissors!"); 
                         System.out.println(""); 
                         turns = turns + 1; 
                         playerScore = playerScore + 1; 
                         play = true; 
                     }
                 }
                 
                 
                 //Player selects rock, computer chooses paper: 
                 if(playerGo.equalsIgnoreCase("rock")){
                     if(random == 2){
                         System.out.println("the computer chose Paper!");
                         System.out.println("Paper covers rock"); 
                         System.out.println(""); 
                         turns = turns + 1; 
                         computerScore = computerScore + 1; 
                         play = true;
                     }
                 }
                 
             
                 //Computer selects rock, Player chooses scissors: 
                 if(playerGo.equalsIgnoreCase("Scissors")){
                     if(random == 1){
                         System.out.println("the computer chose Rock!");
                         System.out.println("Rock blunts scissors!"); 
                         System.out.println(""); 
                         turns = turns + 1;
                         computerScore = computerScore + 1; 
                         play = true;
                     }
                 }
                 
                 //Computer selects rock, Player chooses paper: 
                 if(playerGo.equalsIgnoreCase("paper")){
                     if(random == 1){
                         System.out.println("the computer chose Rock!");
                         System.out.println("Paper covers rock"); 
                         System.out.println(""); 
                         turns = turns + 1; 
                         playerScore = playerScore + 1; 
                         play = true;
                     }
                 }

                 
                 //Computer selects paper, Player chooses scissors: 
                 if(playerGo.equalsIgnoreCase("scissors")){
                     if(random == 2){
                         System.out.println("the computer chose Paper!");
                         System.out.println("Scissors cuts paper"); 
                         System.out.println("");
                         turns = turns + 1;
                         playerScore = playerScore + 1; 
                         play = true;
                     }
                 }
                 
                 //player selects paper, computer chooses scissors: 
                 if(playerGo.equalsIgnoreCase("paper")){
                     if(random == 3){
                         System.out.println("the computer chose Scissors!");
                         System.out.println("Scissors cut paper"); 
                         System.out.println(""); 
                         turns = turns + 1; 
                         computerScore = computerScore + 1; 
                         play = true;
                     }
                 }
        
        }
        
        if(playerScore < computerScore){
            System.out.println("");
            System.out.println("You have lost!!");
            System.out.println("This means you have died!!!"); 
            endLives(); 
            playAgain(); 
        }
        
        if(playerScore > computerScore){
            System.out.println("");
            System.out.println("You won the mini game...");
            System.out.println("This means that you have another chance to play");
        }
        

    }
                       

}
