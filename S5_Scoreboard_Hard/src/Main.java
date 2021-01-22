import java.util.Scanner;

/**
 * @author : olivia Feldman
 * @purpose: To test polymorphism program of scoreboard
 */



public class Main {
    /**
     * Main function that tests polymorphism program
     * @param args
     */
    public static void main(String[] args) {

        //prompting  user to select the sport to keep track of
        Scanner sc = new Scanner(System.in); // creating a new scanner object to input a value from the the user
        String answer = " "; //initalize answer to empty string to be read in by user and assign a value later
        System.out.print("Please select a game " + "\n");
        System.out.println("1: Football");
        System.out.println("2: Baseball");
        System.out.println("3: Soccer");
        System.out.println("4: Hockey" + "\n");
        answer = sc.nextLine(); //reads in answer from user

        if (answer.equals("1")) {
            System.out.print("Please enter team1");
            String team1 = sc.nextLine();
            System.out.print("Please enter team1");
            String team2 = sc.nextLine();
            Football game1 = new Football("football", team1, team2, 0, 0, 0);

            int ks = 0; //count variable to update the quarter for loop

            while (ks != 4) {
                String answer1 = " ";
                game1.printScoreOptions(); //prints the options of scoring the user can pick from
                System.out.println("11: " + " end quarter");//prints out
                answer1 = sc.nextLine(); //reading in user answer

                int answer_num = Integer.parseInt(answer1); //converting string to an int value

                game1.updateScore(answer_num);//usinng input answer to update scores
                ks = game1.getQuarter(); //resets the loop and by updating the quarter

                //prints out end quarter scores
                System.out.println(game1.getTeam1() + " " + game1.getScore1());
                System.out.println(game1.getTeam2() + " " + game1.getScore2());
                System.out.println("Quarter of Game: " + game1.getQuarter());

            }

            game1.winner(game1.getScore1(), game1.getScore2()); //uses method to print winne

        }

        if (answer.equals("2")) {

            //entering  and stroing  team names from ueser
            System.out.print("Please enter team1");
            String team1 = sc.nextLine();
            System.out.print("Please enter team1");
            String team2 = sc.nextLine();
            Baseball game1 = new Baseball("Baseball", team1, team2, 0,0,0);

            String answer1 = " "; //user input answer of scoring
           int  count = 0; //count innings;

            //loop goes through interface 9 times for 9 innings
            while (count != 9){
                game1.printScoreOptions();
                answer1 = sc.nextLine(); //reading in user answer
                int answer_num = Integer.parseInt(answer1); //converting string to an int value
                game1.updateScore(answer_num); //calls updatesmethod and give user input of scoring
                count = game1.getQuarter(); //updates the count of innings for the loop
                System.out.println( " End of Innng: "+ game1.getQuarter()); //prints out the current inning
            }

            game1.winner(game1.getScore1(), game1.getScore2()); // Calls winner method to display winner

        }

        if (answer.equals("3")){
            //entering  and stroing  team names from user
            System.out.print("Please enter team1");
            String team1 = sc.nextLine();
            System.out.print("Please enter team1");
            String team2 = sc.nextLine();
            Soccer game1 = new Soccer("Soccer", team1, team2, 0, 0, 0);

            String answer1 = " "; //user input answer of scoring
            int  count = 0; //count innings;

            //loop goes through twice for 2 halves of a soccer game
            while (count!=2) {
                // method prints out user options for scoring for team
                game1.printScoreOptions();
                answer1 = sc.nextLine(); //reading in user answer
                int answer_num = Integer.parseInt(answer1); //converting string to an int value
                game1.updateScore(answer_num); //calling method to updated scoring
                count = game1.getQuarter(); //updates the count for the loop and stops at end game quarter
                System.out.println(" End of Period: " + game1.getQuarter()); //prints out the current inning
                game1.winner(game1.getScore1(), game1.getScore2()); //calls method to find and display winner
            }
        }

        if (answer.equals("4")){
            //entering  and stroing  team names from ueser
            System.out.print("Please enter team1");
            String team1 = sc.nextLine();
            System.out.print("Please enter team1");
            String team2 = sc.nextLine();
            Hockey game1 = new Hockey("Baseball", team1, team2, 0,0,0);

            String answer1 = " "; //user input answer of scoring
            int  count = 0; //count innings;


            //3 periods in a hockey came loop will loop through all 3 periods
            while (count!=3) {
                //prints out user optoins for scoring for team
               game1.printScoreOptions();
                answer1 = sc.nextLine(); //reading in user answer
                int answer_num = Integer.parseInt(answer1); //converting string to an int value
                game1.updateScore(answer_num);
                System.out.println( " End of Period: "+ game1.getQuarter()); //prints out the current inning
                count = game1.getQuarter(); //incrementing the count
            }
            game1.winner(game1.getScore1(),game1.getScore2()); //calls method to find and display winner

        }

    }
}
