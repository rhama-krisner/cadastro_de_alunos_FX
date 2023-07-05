module app.cadastrodealunos {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens app.cadastrodealunos to javafx.fxml;
    exports app.cadastrodealunos;
}