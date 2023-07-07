package app.cadastrodealunos;

import javafx.fxml.FXML;

import java.io.IOException;

public class MainController {

    @FXML
    private void novoAlunoOnClick() throws IOException {
        NovaJanela novaJanela = new NovaJanela();
        novaJanela.novaJanela("novoAluno.fxml");
    }


}