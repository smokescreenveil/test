import com.badlogic.gdx.Game;
//import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main extends Game {
    public void main(String[] args){
            LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
            config.title = "Game Title";
            config.width = 800;  // Set your desired width
            config.height = 800; // Set your desired height
            // Create a new instance of GamePanel
            GamePanel gamePanel = new GamePanel();
            setScreen(new GamePanel());
        }


    @Override
    public void create() {

    }
}




