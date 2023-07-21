package game;

public class GameApp {
    public static void main(String[] args) {
        Player p=new Player();
        p.jump();
        p.turnAround();
        p.moveLeft();
        p.moveRight();
        p.actions();
    }
}
