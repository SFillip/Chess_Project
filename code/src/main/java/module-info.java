module com.chessproject {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;


    opens com.chessproject to javafx.fxml;
    exports com.chessproject;
}