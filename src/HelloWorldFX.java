import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloWorldFX extends Application{
    public static void main(String[] args){
        launch();
    }
    
    String music = getClass().getResource("TheForceSuiteTheme.mp3").toString();
    
    @Override
    public void start(Stage palco){
        AudioClip clip = new AudioClip(music);
        clip.play();
        Rectangle ceu = new Rectangle(900, 450, Color.DARKRED);
        Rectangle mar = new Rectangle(900, 450, Color.DARKBLUE);
        Circle sol = new Circle(90, Color.YELLOW);
        ceu.setTranslateY(-200);
        mar.setTranslateY(200);
        sol.setTranslateY(50);
        StackPane historia = new StackPane();
        historia.getChildren().addAll(ceu, sol, mar);
        Scene cena = new Scene(historia, 300, 300);
        palco.setScene(cena);
        palco.setTitle("Pituaçú");
        palco.show();
    }
}
