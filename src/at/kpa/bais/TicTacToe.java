package at.kpa.bais;

import java.util.Scanner;
public class TicTacToe {
    /*
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        char currentPlayer = '1';
        boolean gameWon = false;

        initializeBoard(board);

        while (true) {
            printBoard(board);

            int[] move = getPlayerMove(board, currentPlayer);

            int row = move[0];
            int col = move[1];

            if (isValidMove(board, row, col)) {
                board[row][col] = currentPlayer;
                gameWon = isGameWon(board, currentPlayer, row, col);

                if (gameWon) {
                    printBoard(board);
                    System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                    break;
                }

                if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("Unentschieden! Das Spielfeld ist voll.");
                    break;
                }

                currentPlayer = (currentPlayer == '1') ? '2' : '1';
            } else {
                System.out.println("Ungültige Eingabe. Bitte versuche es erneut.");
            }
        }
    }

    public static void initializeBoard(char[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static int[] getPlayerMove(char[][] board, char currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        int[] move = new int[2];
        System.out.print("Spieler " + currentPlayer + ", gib deine Zeile (0-2) ein: ");
        move[0] = scanner.nextInt();
        System.out.print("Spieler " + currentPlayer + ", gib deine Spalte (0-2) ein: ");
        move[1] = scanner.nextInt();
    }

     */
}
