package app.cadastrodealunos;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class NovoAlunoController implements Initializable {

    @FXML
    Button btnCancelar;

    @FXML
    private void onBtnCancelar(){
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Stage stage = new Stage();
        stage.resizableProperty().setValue(false);
        stage.initStyle(StageStyle.UNDECORATED);
    }
}
