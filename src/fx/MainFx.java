package fx;

import javafx.stage.Stage;

public class MainFx {
    public static void main(String[] args) {
        KeyEventDemo keyEventDemo = new KeyEventDemo();
        Stage stage = new Stage();
        keyEventDemo.start(stage);
    }

}
