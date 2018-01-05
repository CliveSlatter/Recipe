package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root,500,500);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();

        GridPane login = new GridPane();
        login.setHgap(10);
        login.setVgap(10);
        login.setAlignment(Pos.CENTER);
        Label lblUser = new Label("Username");
        Label lblPass = new Label("Password");
        TextField txtUser = new TextField();
        PasswordField txtPass = new PasswordField();
        Button btnNewUser = new Button("Create New User");
        btnNewUser.setAlignment(Pos.TOP_CENTER);
        Button btnLogin = new Button("Login");
        login.add(lblUser,0,0);
        login.add(lblPass,0,2);
        login.add(txtUser,2,0);
        login.add(txtPass,2,2);
        login.add(btnLogin,2,4);
        //root.getChildren().addAll(login,btnNewUser);
        root.setCenter(login);
        root.setTop(btnNewUser);



    }

}
