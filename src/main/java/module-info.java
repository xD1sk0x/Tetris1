module org.example.tetris1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tetris1 to javafx.fxml;
    exports org.example.tetris1;
}