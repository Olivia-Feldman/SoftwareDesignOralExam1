/**
 * @author: Olivia Feldman
 * Purpsose: Demonstrate polymorphism by creating a subclass hockey that takes another form
 */


public class Soccer extends Game{


    /**
     * Constructor initializes variables
     * @param sport
     * @param team1
     * @param team2
     * @param score1
     * @param score2
     * @param quarter
     */
    Soccer(String sport, String team1, String team2, int score1, int score2, int quarter) {
        super(sport, team1, team2, score1, score2, quarter);
    }



    //intialize private instance variables
    private final int goal= 1;

    /**
     * Method overwrites the superclass method and prints out scoring options the user can choose
     */
    @Override
    public void printScoreOptions() {
        //prints out user options for scoring for team
        System.out.println("1: " + getTeam1() + " Goal");
        System.out.println("2: " + getTeam2()+ "Goal");
        System.out.println("3:" + "End Half");

    }





    /**
     * method overrides the superclass  method to update the scoring
     * @param answer
     */
    @Override
    public void updateScore(int answer) {

        if (answer == 1) {
            setScore1(1 + getScore1());
        }
        if (answer == 2) {
            setScore2(1 + getScore2());
        }
        if (answer == 3) {
            setQuarter(1 + getQuarter());
        }

    }

    /**
     * Overides it's superclass method
     * @param score1
     * @param score2
     */
    @Override
    public void winner ( int score1, int score2){

        if (score1 > score2) {
            System.out.println(getTeam1() + " is the winner");
        }
        if (score1 == score2) {
            System.out.println("it is a tie");
        } else {
            System.out.println(getTeam2() + " is a winner");
        }
        System.out.println(getTeam1() + " " + getScore1());
        System.out.println(getTeam2() + " " + getScore2());
        System.out.println("Half of game: " + getQuarter());


    }
}
