public class Board {

    private char[][] fullBoard;

    public Board() {
        fullBoard = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                this.fullBoard[row][col] = ' ';
            }
        }
    }

    public void printBoard() {
        System.out.println("  1 2 3");
        for (int row = 0; row < 3; row++) {
            System.out.print((row + 1) + " ");
            for (int col = 0; col < 3; col++) {
                System.out.print(this.fullBoard[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void shoot(int row, int col, int player) {
        // first look if its already occupied
        if (this.fullBoard[row - 1][col - 1] != ' ') {
            System.out.println("Invalid movement, that spot is already occupied");
            return;
        } else {
            if (player == 1) {
                this.fullBoard[row - 1][col - 1] = 'X';
            } else {
                this.fullBoard[row - 1][col - 1] = 'O';
            }
        }
    }

    public String wins() {
        int xCount, oCount;
        //Look row for row
        for (int row = 0; row < 3; row++) {
            xCount = 0;
            oCount = 0;
            for (int col = 0; col < 3; col++) {
                if (this.fullBoard[row][col] == 'X') {
                    xCount += 1;
                } else if (this.fullBoard[row][col] == 'O') {
                    oCount += 1;
                }
            }
            if (xCount == 3) {
                return "The winner is Player 1";
            } else if (oCount == 3) {
                return "The winner is Player 2";
            }
        }
        //Look col for col
        for (int col = 0; col < 3; col++) {
            xCount = 0;
            oCount = 0;
            for (int row = 0; row < 3; row++) {
                if (this.fullBoard[row][col] == 'X') {
                    xCount += 1;
                } else if (this.fullBoard[row][col] == 'O') {
                    oCount += 1;
                }
            }
            if (xCount == 3) {
                return "The winner is Player 1";
            } else if (oCount == 3) {
                return "The winner is Player 2";
            }
        }
        //Look diagonals
        if (this.fullBoard[0][0] == this.fullBoard[1][1] && this.fullBoard[1][1] == this.fullBoard[2][2] &&
                this.fullBoard[2][2] == 'X') {
            return "The winner is Player 1";
        } else if (this.fullBoard[0][2] == this.fullBoard[1][1] && this.fullBoard[1][1] == this.fullBoard[2][0] &&
                this.fullBoard[2][0] == 'X') {
            return "The winner is Player 1";
        } else if (this.fullBoard[0][0] == this.fullBoard[1][1] && this.fullBoard[1][1] == this.fullBoard[2][2] &&
                this.fullBoard[2][2] == 'O') {
            return "The winner is Player 2";
        } else if (this.fullBoard[0][2] == this.fullBoard[1][1] && this.fullBoard[1][1] == this.fullBoard[2][0] &&
                this.fullBoard[2][0] == 'O') {
            return "The winner is Player 2";
        }

        //Look draw
        int spaceCount = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (this.fullBoard[row][col] == ' ') {
                    spaceCount += 1;
                }
            }
        } if (spaceCount ==0){
            return "The game is a Draw";
        }
        return "The game is still going";
    }
}

