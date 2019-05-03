import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Scene {
    int level=1;
    final int sceneHeight=10;
    final int sceneWidth=40;
    List<Model> modelList = new Vector<>();
    public Scene(){
        modelList.add(new Player(20,10));
    }

    void searchModel(int h, int w){
        for(Model model : modelList){

        }
    }
    public void drawScene(){
        System.out.println("------------------------------------------");
        for(int h=1;h<=sceneHeight;h++){
            System.out.print("|");
            for(int w=1;w<=sceneWidth;w++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("------------------------------------------");
    }
    void gameLoop(){

    }
}
