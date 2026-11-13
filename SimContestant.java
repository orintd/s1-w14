import java.util.*;

public class SimContestant {
    
    private int myInitialGuess;
    private boolean stay;
    private Random myRandoms;
    
    public SimContestant (Random randoms) {
        myRandoms = randoms;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = myRandoms.nextInt(3) + 1;//do this ...;
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    public int guess2 (int openedDoor, int straftat) {
        if (straftat == 0)
        return 6 - openedDoor - myInitialGuess;
        else if (straftat == 1)
            return myInitialGuess;
        else{
            int r = (int)myRandoms.nextInt(2);
        if(r==0)
            return 6 - openedDoor - myInitialGuess;
        else
            return myInitialGuess;
        } 
    }
}
