import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 * Created by heesun on 2018. 1. 10..
 */
public class C04_JavaFX_106 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        TextArea shipping = new TextArea();
        TextArea billing = new TextArea();
        billing.textProperty().bindBidirectional(shipping.textProperty());
        VBox root = new VBox();
        root.getChildren().addAll(new Label("Shipping"), shipping, new Label("billing"), billing);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

class Greeting {
    private StringProperty text = new SimpleStringProperty("");

    public final StringProperty textProperty() {
        return text;
    }

    public final void setText(String newValue) {
        text.set(newValue);
    }

    public final String getText() {
        return text.get();
    }
}
