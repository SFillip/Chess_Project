module com.chessproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.chessproject to javafx.fxml;
    exports com.chessproject;
}