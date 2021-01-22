/**
 * @author: Olivia Feldman
 * @purose: Is demonstrate polymorphism by creating a hockey class that extends Game and implementing a new from
 */



public class Hockey  extends Game {

    /**
     * Constructor initializes all instant varibles
     *
     * @param sport is the type of sport the user will record the game wiht
     * @param team1 a team that is playing during the game
     * @param team2 the other team that is playing durign the game
     * @param score1 score value  of team1 one that will   be updated by the user
     * @param score2 score value  of team2 one that will   be updated by the user
     * @param quarter quarter of divison of time in a game
     */
    Hockey(String sport, String team1, String team2, int score1, int score2, int quarter) {
        super(sport, team1, team2, score1, score2, quarter);
    }

    /**
     * declaring private instance variables goal to store a set value of goal
     */
    private int goal = 1;

    /**
     *
     */
    @Override
    public void printScoreOptions() {

        //prints out user options for scoring for team
        System.out.println("1:" + getTeam1() + "Goal");
        System.out.println("2:" + getTeam2()+ "Goal");
        System.out.println("3:" + "End Period");

    }

    /**
     * method ovverrides the superclass method and updates the teams score for each team
     *
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
     * Method overrides the superclass method to determine the winner and display the correct time of game
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
        System.out.println("Period of Game: " + getQuarter());


    }
}