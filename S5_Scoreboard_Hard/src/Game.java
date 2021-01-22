

/**
 * @author: olivia Feldman
 * @purpose:
 */

public abstract class Game{


    /**
     *   private instance variable variables for game class are used to store basic sport game features
     */

    private String sport; //type of game played
    private  String team1; //team 1
    private String team2; //team 2
    private int score1; //score of team 1
    private int score2; // score of team 2
    private int quarter; // current quarter of the game


    /**constructor to intialize game variables
     *
     * @param sport
     * @param team1
     * @param team2
     * @param score1
     * @param score2
     * @param quarter
     */
    Game(String sport, String team1, String team2, int score1, int score2, int quarter ){

        this.setSport(sport);
        this.setTeam1(team1);
        this.setTeam2(team2);
        this.setScore1(score1);
        this.setScore2(score2);
        this.setQuarter(quarter);
    }

    /** Getter for sport
     *
     * @return sport
     */
    public String getSport() {
        return sport;
    }

    /**
     *
     * @param sport
     */
    public void setSport(String sport) {
        this.sport = sport;
    }

    /**
     *
     * @return team 1
     */
    public String getTeam1() {
        return team1;
    }

    /**
     *
     * @param team1
     */
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    /**
     *
     * @return team2
     */
    public String getTeam2() {
        return team2;
    }

    /**
     *
     * @param team2
     */
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    /**
     *
     * @return score1
     */
    public int getScore1() {
        return score1;
    }

    /**
     *
     * @param score1
     */
    public void setScore1(int score1) {
        this.score1 = score1;
    }

    /**
     *
     * @return score2
     */

    public int getScore2() {
        return score2;
    }

    /**
     *
     * @param score2
     */
    public void setScore2(int score2) {
        this.score2 = score2;
    }

    /**
     *
     * @return quarter
     */
    public int getQuarter() {
        return quarter;
    }

    /**
     *
     * @param quarter
     */
    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public abstract void printScoreOptions();

    /**
     * abstract method will be implemented in subclasses and creating different forms of updating the score
     * @param answer
     */
    public abstract void updateScore(int answer);

    /**
     * abstract method will me implemented in sublcasses and creating  differente forms of this winner function
     * @param score1
     * @param score2
     */
    public abstract void winner ( int score1, int score2);


}
