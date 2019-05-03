import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws InterruptedException {
        //List<String> body = new ArrayList<String>();
       /* String body = "  <_/\\_>";
        for(int i=0;i<5;i++) {
            System.out.println(i);
            System.out.println(body);
            //System.out.println("Hello");
            TimeUnit.SECONDS.sleep(1);
            Main.clearScreen();
        }*/
       Scene s= new Scene();
       s.drawScene();
    }
}
