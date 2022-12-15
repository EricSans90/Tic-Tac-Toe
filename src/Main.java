public class Main {
    public static void main(String[] args) {
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
        System.out.println(game.wins());
    }
}
