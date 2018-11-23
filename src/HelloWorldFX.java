import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

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
        TranslateTransition mov = new TranslateTransition(Duration.millis(10000), sol);
        mov.setByY(-100);
        mov.setCycleCount(Timeline.INDEFINITE);
        mov.setAutoReverse(true);
        mov.play();
        FadeTransition ft = new FadeTransition(Duration.millis(10000), ceu);
        ft.setFromValue(1.0);
        ft.setToValue(0.5);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
        mar.setStyle("-fx-fill: "
            + "linear-gradient(#7FFFD4, #00CED1),"
            + "linear-gradient(#008B8B, #2F4F4F),"
            + "linear-gradient(#00CED1 0%, #20B2AA 50%, #0000CD 100%),"
            + "linear-gradient(from 0% 0% to 55% 50%, "
            + "rgba(255,255,255,0.9), rgba(255,255,255,0));");
        ceu.setStyle("-fx-fill: "
            + "linear-gradient(#efaa22, #ffea6a),"
            + "linear-gradient(#f2ba44, #ffef84),"
            + "linear-gradient(#e68400, #ffd65b),"
            + "linear-gradient(#ffe657 100%, #f8c202 50%, #eea10b 0%),"
            + "linear-gradient(from 0% 0% to 55% 50%, "
            + "rgba(255,255,255,0.9), rgba(255,255,255,0));");

        StackPane historia = new StackPane();
        historia.getChildren().addAll(ceu, sol, mar);
        Scene cena = new Scene(historia, 300, 300);
        palco.setScene(cena);
        palco.setTitle("Pituaçú");
        palco.show();
    }
}
