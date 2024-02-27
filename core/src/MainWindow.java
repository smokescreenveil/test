import java.awt.*;

public class MainWindow {
    public static void main(String[] args) {
        // Create a new instance of MainWindow
        MainWindow mainWindow = new MainWindow();

        // Call the method to create and display the window
        mainWindow.createAndShowWindow();
    }

    public void createAndShowWindow() {
        // Create a new frame
        Frame frame = new Frame("Main Project Window");

        // Set the size of the frame
        frame.setSize(800, 800);

        // Make the frame visible
        frame.setVisible(true);
    }
}