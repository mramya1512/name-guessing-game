import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String scannedName = "";
        String scannedChoice = "";
        int guessCount = 0;
        while (!scannedName.equals("Emma")) {
            System.out.println("Guess the name:");
            scannedName = scanner.nextLine();
            if (scannedName.equals("Emma")) {
                System.out.println("congratulation! you have guessed: " + guessCount + " time.");

            } else {
                System.out.println("You lost try again");
                System.out.println("do you want to quit : y/n");
                scannedChoice = scanner.nextLine();
                guessCount++;
                if (scannedChoice.equals("y")) {
                    break;
                }
            }
        }

    }
}
