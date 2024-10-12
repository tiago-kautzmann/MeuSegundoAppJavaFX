module com.example.meusegundoappjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.meusegundoappjavafx to javafx.fxml;
    exports com.example.meusegundoappjavafx;
}