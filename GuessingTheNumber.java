import java.util.Scanner;
import java.util.Random;
public class GuessingTheNumber{
    public static void main(String args[]){
        Scanner read =new Scanner(System.in);
        String game ="yes";
        int round =0 ,TotalScore =0 ,TotalTrails =0;
        System.out.println();
        System.out.println("A number is choosen between 1 to 100. Guess the Number within 5 trails.");
        while(game.equals("yes")){
            ++round;
            int guess_no ,i ,k =5 ,trails =0 ,score =5;
            Random randm =new Random();
            int num =randm.nextInt(100);
            for(i =0 ;i <k ;i++){
                System.out.println();
                System.out.print("Guess the number : ");
                guess_no =read.nextInt();
                if(num ==guess_no){
                    trails++;
                    System.out.println("Congratulations! You have guessed the number");
                    System.out.println();
                    System.out.println("\nTrails :"+trails);
                    System.out.println("Score :"+score);
                    TotalTrails +=trails;
                    TotalScore +=score;
                    System.out.println();
                    System.out.println("Would you like yo play again? yes or no :");
                    game =read.next().toLowerCase();
                    break;
                    }
                    else if(num >guess_no &&i !=k-1){
                        System.out.println("The number is greater than "+guess_no);
                        trails++;
                        score--;
                        }
                        else {
                            System.out.println("The number is less than "+guess_no);
                            trails++;
                            score--;
                            }
            }
            if(i == k){
                System.out.println("You have completed all 5 trails");
                System.out.println("The number was " + num);
                TotalTrails += trails;
                TotalScore += score;
                System.out.println("\nTrails : "+trails);
                System.out.println("Score: "+score);
                System.out.println();
                System.out.println("Would you like yo play again? yes or no : ");
                game = read.next().toLowerCase();
                }
        }
        System.out.println("\nRounds : " + round);
        System.out.println("Total Trails : "+TotalTrails);
        System.out.println("Total Score : "+TotalScore);
    }
}
