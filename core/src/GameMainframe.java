import com.badlogic.gdx.Game;

public class GameMainframe extends Game {

    public void create() {


    // Create a new instance of MainWindow
    MainWindow mainWindow = new MainWindow();
        setScreen(new Play());



    }
}
