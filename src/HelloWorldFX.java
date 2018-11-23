import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloWorldFX extends Application{
    public static void main(String[] args){
        launch();
    }
    
    @Override
    public void start(Stage palco){
        Rectangle ceu = new Rectangle(900, 450);
        Rectangle mar = new Rectangle(900, 450);
        Circle sol = new Circle(90);
        StackPane historia = new StackPane();
        historia.getChildren().addAll(ceu, sol, mar);
        Scene cena = new Scene(historia, 300, 300);
        palco.setScene(cena);
        palco.show();
    }
}
