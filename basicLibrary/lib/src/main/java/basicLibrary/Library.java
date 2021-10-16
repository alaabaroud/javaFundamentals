package basicLibrary;
import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
}
public  static void main (String[] args) {
    List<String> votes = new ArrayList<>();
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Shrub");
    votes.add("Hedge");
    votes.add("Shrub");
    votes.add("Bush");
    votes.add("Hedge");
    votes.add("Bush");

    String winner = tally(votes);
    System.out.println(winner + " received the most votes!");
    }

    public static String tally(List<String> votes){
    String winner = null;
    int numberOfWinnerVotes =0;
        for (String person: votes) {
            if (Collections.frequency(votes, person) > numberOfWinnerVotes) {
                winner = person;
                numberOfWinnerVotes = Collections.frequency(votes, person);
            }
        }
return winner;
        }
    }