package game;

import java.util.Scanner;

public class GuessTheWord {
    private boolean play = true; 
    private Words randomWord = new Words() ;
    private Scanner scanner= new Scanner(System.in) ; 
    private int rounds = 10 ; 
    private char lastRound ;  
   public void start()
   {
     do 
     {
        showWord() ; 
        getInput(); 
        checkInput() ; 
         
     }while(play); 
   }
   
   void showWord()
   {
    System.out.println(" you have " + rounds + "tries left") ;  
    System.out.println(randomWord) ; 
   }
  
  
   void getInput()
   {
     
    
    System.out.println("guess a letter in the word ") ; 
    String userGuess = scanner.nextLine() ; 
    lastRound = userGuess.charAt(0) ; 
     
    }
   
   





   void checkInput()
   {
      
    
      boolean guesscorrect = randomWord.guess(lastRound) ; 
      if(guesscorrect )
      {
        if(randomWord.isGuessedRight())
        {
          System.out.println("congrats ! , you won ") ;
          System.out.println("the word is " + randomWord) ;  
          play = false ; 
         }
      }
      else{
        rounds-- ; 
        if(rounds ==  0 )
        {
          System.out.println("game over !") ; 
          System.out.println("correct word is : " + randomWord.selectedWord) ; 
          play = false ; 
        }
      }
    }

   public void end() 
   {
    
    scanner.close() ; 

   }
  







}

