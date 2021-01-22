

import java.util.Scanner;

/**
 * @author : Olivia Feldman
 * @purpose:
 *
 */

public  class Football extends Game {


    /**
     * construcotr intializes game freatures
     * @param sport
     * @param team1
     * @param team2
     * @param score1
     * @param score2
     * @param quarter
     */
    Football(String sport, String team1, String team2, int score1, int score2, int quarter) {
        super(sport, team1, team2, score1, score2, quarter);

    }

    /**
     *
     */

    @Override
    public void printScoreOptions() {
        System.out.println("1: " + getTeam1() + " Touch down");
        System.out.println("2: " + getTeam1() + " Field goal");
        System.out.println("3: " + getTeam1() + " extra Point");
        System.out.println("4: " + getTeam1() + " Twopoint Conversion ");
        System.out.println("5: " + getTeam1() + " safety");

        System.out.println("6: " + getTeam2() + " Touch down");
        System.out.println("7: " + getTeam2() + " Field goal");
        System.out.println("8: " + getTeam2() + " Extra Point");
        System.out.println("9: " + getTeam2() + " Twopoint Conversion ");
        System.out.println("10: " + getTeam2() + " safety");
    }


    /**
     *   private instance variable variables for game class
     */
    private final int touchdown = 6;
    private final int fieldgoal = 3;
    private final int extrapoint1 = 1;
    private final int twopoint_conversion = 2;
    private final int safety = 2;
    private int[] score = new int[]{6, 3, 1, 2, 2, 6, 3, 1, 2, 2, 0, 0};

    Scanner sc = new Scanner(System.in);

    /**
     * method updates the scoring and quarter of both teams from user input in driver
     * @param answer_num
     */
    @Override
    public  void updateScore(int answer_num) {
        //loop assings score based on which team scored and ends quarter if users has decided
        for (int i = 1; i <= 11; i++) {
            if (answer_num == i) {

                if (answer_num <= 5) {

                    setScore1(score[i-1] + getScore1()); //Score  array assigns team 1 a score when the index is less then 4

                }
                if (answer_num >= 6 && answer_num !=11) {
                    setScore2(score[i-1] + getScore2());// score array assigns team 2 a score when index is >= to five

                }
            }
        }
        if (answer_num == 11) {
            setQuarter(getQuarter() + 1);

        }
    }

    /**
     * overrides the superclass function winner to display and find winner of  the game
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
        System.out.println("Quarter of game: " + getQuarter());


    }

}