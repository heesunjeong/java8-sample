import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by heesun on 2018. 1. 11..
 */
public class C04_JavaFX_100 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label message = new Label("hello, javaFx!");
        message.setFont(new Font(100));

        Button red = new Button("Red");
        red.setOnAction(event -> message.setTextFill(Color.RED));

        Slider slider = new Slider();
        slider.valueProperty().addListener(property -> message.setFont(new Font(slider.getValue())));

        VBox root = new VBox();
        root.getChildren().addAll(red, message, slider);

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Hello");

        primaryStage.show();
    }
}
