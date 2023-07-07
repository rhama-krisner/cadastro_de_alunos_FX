package app.cadastrodealunos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MainController {

    @FXML
    Button btnNovoAluno;

    @FXML
    private void novoAlunoOnClick() throws IOException {
        NovaJanela novaJanela = new NovaJanela();
        novaJanela.novaJanela("novoAluno.fxml");
    }


}