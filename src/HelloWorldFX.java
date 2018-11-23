import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorldFX extends Application{
    public static void main(String[] args){
        launch();
    }
    
    @Override
    public void start(Stage palco){
        Label texto = new Label("Último dia de aula.");
        StackPane historia = new StackPane();
        historia.getChildren().add(texto);
        Scene cena = new Scene(historia, 300, 300);
        palco.setScene(cena);
        palco.show();
    }
}
