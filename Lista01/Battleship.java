import java.util.Scanner;

// Professor, as variáveis globais são apenas para fins estéticos e o banner também (Dependendo do tamanho do terminal ele desformata, mas não afeta o jogo ;))

public class Battleship {
    static String errorText = "\u001B[31m", normalText = "\u001B[0m", boldText = "\u001B[1m", sucessText = "\u001B[32m";
    public static void main(String[] args) {
        String banner =
            "__        __   _                            _          ____        _   _   _           _     _       _ _ _ \n" +
            "\\ \\      / /__| | ___ ___  _ __ ___   ___  | |_ ___   | __ )  __ _| |_| |_| | ___  ___| |__ (_)_ __ | | | |\n" +
            " \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  |  _ \\ / _` | __| __| |/ _ \\/ __| '_ \\| | '_ \\| | | |\n" +
            "  \\ V  V /  __/ | (_| (_) | | | | | |  __/ | || (_) | | |_) | (_| | |_| |_| |  __/\\__ \\ | | | | |_) |_|_|_|\n" +
            "   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |____/ \\__,_|\\__|\\__|_|\\___||___/_| |_|_| .__/(_|_|_)\n" +
            "                                                                                              |_|        \n";
        
        System.out.println(banner);

        Scanner scanner = new Scanner(System.in);

        char[][] board1 = new char[5][5];
        char[][] board2 = new char[5][5];

        char[][] historyBoard1 = new char[5][5];
        char[][] historyBoard2 = new char[5][5];

        fetchBoard(board1);
        fetchBoard(board2);

        fetchBoard(historyBoard1);
        fetchBoard(historyBoard2);

        int x, y;
        for(int i = 0; i < 2; i++) {
            char[][] board = i == 0 ? board1 : board2;
            System.out.printf(boldText + "PLAYER %d, ENTER YOUR SHIPS' COORDINATES.\n" + normalText, i + 1);
            for(int j = 0; j < 5; j++) {
                while(true) {
                    System.out.printf("Enter ship %d location: \n", j + 1);
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    if(validateCoordinates(board, x, y, true)) break;
                }
                board[x][y] = '@';
            }
            printBoard(board);
        }

        int[] points = new int[2];
        points[0] = 0;
        points[1] = 0;

        loop: while(true) {
            for(int i = 0; i < 2; i++) {
                char[][] historyBoard = i == 0 ? historyBoard1 : historyBoard2;
                char[][] opponentBoard = i == 0 ? board2 : board1;
                while(true) {
                    System.out.printf("Player %d, enter hit row/column:\n", i + 1);
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    if(validateCoordinates(historyBoard, x, y, false)) break;
                }

                System.out.printf(boldText);
                if(shoot(historyBoard, opponentBoard, x, y)) {
                    System.out.printf("\nPLAYER %d HIT PLAYER %d's SHIP!\n", i + 1, i == 0 ? 2 : 1);
                    points[i]++;
                } else System.out.printf("\nPLAYER %d MISSED!\n", i + 1);
                System.out.printf(normalText);
                printBoard(historyBoard);

                if(points[i] == 5) break loop;
            }
        }

        System.out.printf(sucessText + "PLAYER %d WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!\n" + normalText, points[0] == 5 ? 1 : 2);
        System.out.println("Final boards:");
        printBoard(board1);
        printBoard(board2);

        scanner.close();
    }

    public static void fetchBoard(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static boolean validateCoordinates(char[][] board, int x, int y, boolean isAddAction) {
        boolean res = false;
        int size = board.length - 1;

        System.out.print(errorText);
        if(x < 0 || x > size || y < 0 || y > size) System.out.println("Invalid coordinates. Choose different coordinates.");
        else if(board[x][y] == 'X') System.out.println("You already fired on this spot. Choose different");
        else if(board[x][y] == '@' && isAddAction) System.out.println("You already have a ship there. Choose different coordinates.");
        else res = true;
        System.out.print(normalText);

        return res;
    }

    public static void printBoard(char[][] board) {
        System.out.print("\n \t");
        for (int j = 0; j < board.length; j++) System.out.print(j + "\t");
        System.out.println('\n');
    
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + "\t"); 
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println('\n'); 
        }
        System.out.println();
    }

    public static boolean shoot(char[][] historyBoard, char[][] opponentBoard, int x, int y) {
        boolean res = false;
        switch(opponentBoard[x][y]) {
            case '-':
            historyBoard[x][y] = 'O';
            opponentBoard[x][y] = 'O';
            break;
            case '@':
            historyBoard[x][y] = 'X';
            opponentBoard[x][y] = 'X';
            res = true;
            break;
        }
        return res;
    }
}
