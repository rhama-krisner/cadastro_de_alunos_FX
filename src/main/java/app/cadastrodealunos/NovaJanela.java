package app.cadastrodealunos;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class NovaJanela extends Stage {
    public void novaJanela(String fxml) throws IOException {
        Stage stage  = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(fxml));
        Scene scene = new Scene(fxmlLoader.load());

        Image image = new Image("patins.png");
        stage.getIcons().add(image);

        stage.setTitle("Novo Aluno");
        stage.setScene(scene);
        stage.show();

    }

    public void fechar(){
        close();
    }
}
