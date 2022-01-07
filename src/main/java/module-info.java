module sample.server.chatserver {
    requires javafx.controls;
    requires javafx.fxml;
    requires android.json;


    opens sample.server.chatserver to javafx.fxml;
    exports sample.server.chatserver;
}