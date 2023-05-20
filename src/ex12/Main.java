package ex12;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sa se simuleze jocul piatra foarfeca hartie si sa se stabileasca castigatorul
        //inlocuim player 2 cu date introduse de utilizator
        String[] options = {"piatra", "foarfeca", "hartie"};
        Random random = new Random();

        int player1Score = 0;
        int player2Score = 0;

        for (int i = 0; i <= 2; i++) {
            System.out.println("Runda" + (i + 1));
            System.out.println("Player 1 score: " + player1Score);
            System.out.println("Player 2 score: " + player2Score);

            int player1 = random.nextInt(3);
            //  int player2 = random.nextInt(3);
            int player2 = handleUserInput();

            String playerText1 = options[player1];
            String playerText2 = options[player2];

            if (playerText1.equals(playerText2)) {
                System.out.println("Egalitate");
            } else if (playerText1.equals("piatra") && playerText2.equals("foarfeca")) {
                System.out.println("Player 1 wins");
                player1Score++;
            } else if (playerText1.equals("foarfeca") && playerText2.equals("hartie")) {
                System.out.println("Player 1 wins");
                player1Score++;
            } else if (playerText1.equals("hartie") && playerText2.equals("piatra")) {
                System.out.println("Player 1 wins");
                player1Score++;
            } else {
                System.out.println("Player 2 wins");
                player2Score++;
            }
        }
        if (player1Score > player2Score) {
            System.out.println("Match: Player 1 wins match!");
        } else if (player2Score > player1Score) {
            System.out.println("Match: Player 2 wins match!");
        } else {
            System.out.println("Match: It's a tie!");
        }
    }

    public static int handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        // int optiune = 0;
//        do  {
//            System.out.println("Alegeti o optiune: 0 - piatra; 1 - hartie; 2 - foarfeca");
//             optiune = scanner.nextInt();
//            if (optiune > 2) {
//                System.out.println("Optiunea este invalida");
//            }
//
//        } while (optiune > 2);

        int optiune =0;
        do {
            System.out.println("Alegeti o optiune: piatra; hartie; foarfeca\n");
           String input = scanner.nextLine();
            if (input.equals("piatra")) {
                 optiune = 0;
                break;
            } else if (input.equals("hartie")) {
                 optiune = 1;
                break;
            } else if (input.equals("foarfeca")) {
                 optiune = 2;
                break;
            }

        } while (true);

        return optiune;
        }
    }
