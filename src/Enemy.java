public class Enemy extends Model {
    int length;
    public Enemy(int x,int y){
        body="<>";
        length=body.length();
        projectile="*";
        health=100;
        position.x=x;
        position.y=y;
    }
    @Override
    void drawModel(){
        System.out.println(body);
    }
}
