

import java.util.Scanner;

public class numbergame {

    public static void guessthenumber() {
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 100) + 1;
        int maxTrials = 5;
        int remainingTrials = maxTrials;
        int guess;

        System.out.println("A number is generated between 1 to 100.\nYou have to guess in " + maxTrials + " tries");

        for (int i = 0; i < maxTrials; i++) {
            guess = sc.nextInt();

            if (num == guess) {
                System.out.println("Congratulations! You won.");
                break;
            } else if (guess > num) {
                System.out.println("Your guess is too high.\nYou have " + (remainingTrials - 1) + " trials left");
            } else {
                System.out.println("Your guess is too low.\nYou have " + (remainingTrials - 1) + " trials left");
            }
            remainingTrials--;

            if (remainingTrials == 0) {
                System.out.println("You have exhausted all trials.");
                System.out.println("The number was " + num);
            }
        }
    }

    public static void main(String[] args) {
        guessthenumber();
    }
}
