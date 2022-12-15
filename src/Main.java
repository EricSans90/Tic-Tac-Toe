import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int playerStart, rowShoot, colShoot;
        System.out.println("Qué jugador empieza? el 1 o el 2?");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        playerStart = inputValue.nextInt();
        Board game = new Board(playerStart);
        while (game.isPlaying()){
            game.printBoard();
            System.out.println("Player "+game.getCurrentPlayer()+" try to shoot inserting row and col");
            Scanner inputValue1;
            inputValue1 = new Scanner(System.in);
            rowShoot = inputValue1.nextInt();
            Scanner inputValue2;
            inputValue2 = new Scanner(System.in);
            colShoot = inputValue2.nextInt();
            game.shoot(rowShoot,colShoot, game.getCurrentPlayer());
            System.out.println(game.wins());

        }








        /*Simulated game
        Board game = new Board();
        game.printBoard();
        game.shoot(1,1,1);
        game.printBoard();
        System.out.println(game.wins());
        game.shoot(1,2,2);
        game.printBoard();
        game.shoot(2,1,1);
        game.printBoard();
        System.out.println(game.wins());
        game.shoot(3,1,2);
        game.printBoard();
        game.shoot(2,2,1);
        game.printBoard();
        System.out.println(game.wins());
        game.shoot(2,3,2);
        game.printBoard();
        game.shoot(3,2,1);
        game.printBoard();
        System.out.println(game.wins());
        game.shoot(3,3,3);
        game.printBoard();
        System.out.println(game.wins());
        game.shoot(1,3,1);
        game.printBoard();
        System.out.println(game.wins());*/
    }
}
