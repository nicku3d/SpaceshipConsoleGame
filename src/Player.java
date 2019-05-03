public class Player extends Model{

    public Player(int x,int y){
        body="<_/\\_>";
        projectile="*";
        health=100;
        position.y=y;
        position.x=x;
    }
    @Override
    void drawModel() {
        System.out.print(body);
    }
}
