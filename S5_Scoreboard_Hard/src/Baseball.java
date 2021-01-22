/**
 * @author: Olivia Feldman
 * @purpose: purpose of this class is to demonstrate polymorphism using baseball as a different form as game
 */


public class Baseball extends Game{


    /**
     *construcotor intializes game features from game superclass
     * @param sport
     * @param team1
     * @param team2
     * @param score1
     * @param score2
     * @param quarter
     */
    Baseball(String sport, String team1, String team2, int score1, int score2, int quarter) {
        super(sport, team1, team2, score1, score2, quarter);
    }

    /**
     *
     */
    @Override
    public void printScoreOptions() {

        //printing out the options of scoring the user can choose from and for what team
        System.out.println("1: " + getTeam1() + " Homerun");
        System.out.println("2: " + getTeam1() + " SingleRun");
        System.out.println("3: " + getTeam1() + " PitchingWun");

        System.out.println("4: " + getTeam2()+ " Homerun");
        System.out.println("5: " +getTeam2()+ " SingleRun");
        System.out.println("6 "+ getTeam2()+ "  pithcingWin");
        System.out.println("7 "+  " End Inning");

    }


    /**
     * private instance variables  for scoring
     */
    private final int homeRun = 4;
    private final int singleHit=1;
    private final int pitichingWin = 3;
    private int[] score = new int[]{4, 1, 3, 4,1,3,0};

    /**
     *  Overrides the superclass method to implement a correct updated score
     * @param answer
     */
    @Override
   public void updateScore(int answer) {
        for (int i = 1; i < score.length; i++) {
            if (answer == i) {
                if (answer <= 3) {

                    setScore1(score[i-1] + getScore1());
                }
                if (answer >= 4 && answer!=7) {
                    setScore2(score[i-1] + getScore2());
                }

            }
        }
        if (answer == 7) {
            setQuarter(1 + getQuarter());
        }

    }

    /**
     * Overrides the superclass method to implement a correct updated winner and displays the winner
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
        System.out.println("Inning of game: " + getQuarter());


    }



    }
