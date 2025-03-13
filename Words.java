package game;
import java.util.*; 

public class Words {
    private String[] randomWords = {"animals " , "happiness" , "steady", 
    "birthday" , 
    "extreme" , "rights" , 
    "properties" , "ceremony" , "gift" , "love" , "family"} ;
   public String selectedWord ; 
   private char[] letters ; 

    
    public Words()
    {
        Random rand = new Random() ; 
        int n = rand.nextInt(randomWords.length); 
        selectedWord = randomWords[n]; 
        letters = new char[selectedWord.length()] ; 
    }



    public String toString() 
    {
       
               
        StringBuilder text = new StringBuilder() ; 

        for(char letter : letters )
        {   
            text.append(letter == '\u0000' ? '-' : letter)  ; 
            text.append(' ') ; 
        }
        
       return text.toString() ; 
        
    }

    public boolean isGuessedRight()
    {
        
        
        for(char letter : letters) 
        {
            if(letter == '\u0000')
            {
                return false ; 
            }
        }
        return true ; 
    }
    
    
    
    public boolean guess(char letter)
    {
        boolean guesscorrect  = false ; 
        for(int i =0 ; i< selectedWord.length() ; i++)
        {
            if(letter == selectedWord.charAt(i))
            {
                letters[i] = selectedWord.charAt(i) ; 
                guesscorrect  =true ; 
            }
        }
        return guesscorrect  ; 
    }

}
