

package pharmacy_project;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.Stage;


public class pharmacy_project extends Application {
    
    @Override // open login.fxml
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
