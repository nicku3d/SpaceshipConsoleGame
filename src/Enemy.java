public class Enemy extends Model {
    int length;
    public Enemy(){
        body="<>";
        length=body.length();
        projectile="*";
        health=100;
    }
    @Override
    void drawModel(){
        System.out.println(body);
    }
}
