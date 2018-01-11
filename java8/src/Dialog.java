import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by heesun on 2018. 1. 11..
 */
public class Dialog implements Initializable {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button okButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        password.disableProperty().bind(
                Bindings.createBooleanBinding(
                        () -> username.getText().length() == 0
                                || password.getText().length() == 0,
                        username.textProperty(), password.textProperty()));

        okButton.setOnAction(event -> System.out.println("Verifying " + username.getText() + ":" + password.getText()));

    }
}
