import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Scene {
    private int level=1;
    private final int sceneHeight=10;
    private final int sceneWidth=40;
    private Player player;
    List<Model> modelList;
    public Scene(){
        //modelList=new ArrayList<>();
        player = Player.getInstance();
    }

    /*void searchModel(int h, int w){
        for(Model model : modelList){

        }
    }*/
    int drawPlayer(int x,int y){
        if(player.getPosition().x==x && player.getPosition().y == y) {
            player.drawModel();
            return player.getLength();
        } else return 0;
    }
    public void drawScene(){
        System.out.println("Level: "+level);
        System.out.println("------------------------------------------");
        for(int h=1;h<=sceneHeight;h++){
            System.out.print("|");
            for(int w=1;w<=sceneWidth;w++){
                w+=drawPlayer(w,h);
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("------------------------------------------");
    }
    void gameLoop(){

    }
}
