import java.awt.*;

public class Player extends Model {

    private static Player player=null;
    private int length=0;

    private Player() {
        body = "<_/\\_>";
        projectile = "*";
        length=body.length();
        health = 100;
        position=new Point(20, 10);
    }

    public int getLength(){
        return length;
    }

    public static Player getInstance() {
        if (player == null) player = new Player();
        return player;
    }

    @Override
    void drawModel() {
        System.out.print(body);
    }
}
