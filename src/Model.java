import java.awt.*;

public abstract class Model{
    int health;
    String projectile;
    String body;
    Point position; //position is when the model starts
    //x---->
    //y
    //|
    //|
    //V
    abstract void drawModel();
    boolean isAlive(){
        if(health<=0) return false;
        else return true;
    }
    public Point getPosition(){
        return position;
    }
}
