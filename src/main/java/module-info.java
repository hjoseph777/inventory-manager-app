module com.inventorytracker {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.inventorytracker to javafx.fxml;
    exports com.inventorytracker;
}
