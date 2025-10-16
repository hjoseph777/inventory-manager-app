package com.inventorytracker;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Harry's Inventory Tracker - JavaFX app for product management
 *
 * Simple app to log products. Has event handling for buttons, keyboard, mouse.
 */
public class InventoryManager extends Application {

    // UI components
    private TextField productNumberField;
    private TextField productDescriptionField;
    private TextField productPriceField;
    private Button saveButton;
    private Button quitButton;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Harry's Inventory Tracker");

        VBox mainLayout = createMainLayout();

        Scene scene = new Scene(mainLayout, 450, 300);
        primaryStage.setScene(scene);

        primaryStage.setResizable(false);

        primaryStage.show();
    }

    private VBox createMainLayout() {
        VBox mainContainer = new VBox(20);
        mainContainer.setPadding(new Insets(25));
        mainContainer.setAlignment(Pos.CENTER);
        mainContainer.setStyle("-fx-background-color: #f8f9fa;");

        Label titleLabel = new Label("Product Inventory Entry");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: #2c3e50;");

        GridPane formGrid = createInputForm();

        mainContainer.getChildren().addAll(titleLabel, formGrid);

        return mainContainer;
    }

    private GridPane createInputForm() {
        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(20));
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: white; -fx-background-radius: 10; -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.1), 10, 0, 0, 5);");

        // Product number
        Label numberLabel = new Label("Product Number:");
        numberLabel.setStyle("-fx-font-weight: bold;");
        productNumberField = new TextField();
        productNumberField.setPromptText("e.g., PROD-001");
        productNumberField.setPrefWidth(200);

        // Description
        Label descriptionLabel = new Label("Product Description:");
        descriptionLabel.setStyle("-fx-font-weight: bold;");
        productDescriptionField = new TextField();
        productDescriptionField.setPromptText("e.g., Wireless Mouse");
        productDescriptionField.setPrefWidth(200);

        // Price
        Label priceLabel = new Label("Product Price ($):");
        priceLabel.setStyle("-fx-font-weight: bold;");
        productPriceField = new TextField();
        productPriceField.setPromptText("e.g., 29.99");
        productPriceField.setPrefWidth(200);

        // Buttons
        saveButton = new Button("Save Product");
        saveButton.setPrefWidth(120);
        saveButton.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 5;");

        quitButton = new Button("Quit");
        quitButton.setPrefWidth(120);
        quitButton.setStyle("-fx-background-color: #e74c3c; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 5;");

        // Add to grid
        grid.add(numberLabel, 0, 0);
        grid.add(productNumberField, 1, 0);
        grid.add(descriptionLabel, 0, 1);
        grid.add(productDescriptionField, 1, 1);
        grid.add(priceLabel, 0, 2);
        grid.add(productPriceField, 1, 2);
        grid.add(saveButton, 0, 3);
        grid.add(quitButton, 1, 3);

        setupEventHandlers();

        return grid;
    }

    private void setupEventHandlers() {
        saveButton.setOnAction(new SaveButtonHandler());
        quitButton.setOnAction(new QuitButtonHandler());
        productPriceField.setOnKeyPressed(new PriceFieldKeyHandler());

        // TODO: maybe add keyboard shortcuts later? Ctrl+S for save?

        saveButton.setOnMouseEntered(new ButtonHoverHandler(saveButton, true));
        saveButton.setOnMouseExited(new ButtonHoverHandler(saveButton, false));
        quitButton.setOnMouseEntered(new ButtonHoverHandler(quitButton, true));
        quitButton.setOnMouseExited(new ButtonHoverHandler(quitButton, false));
    }

    private class SaveButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            String productNumber = productNumberField.getText().trim();
            String description = productDescriptionField.getText().trim();
            String price = productPriceField.getText().trim();

            if (productNumber.isEmpty() || description.isEmpty() || price.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Oops! Missing Information");
                alert.setHeaderText("Please fill in all fields");
                alert.setContentText("We need the product number, description, and price to save this item.");
                alert.showAndWait();
                return;
            }

            // Success message
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Product Saved Successfully!");
            alert.setHeaderText("Your product has been added to the inventory");
            alert.setContentText(String.format(
                "Product saved! Number: %s, Name: %s, Price: $%s",
                productNumber, description, price
            ));
            alert.showAndWait();

            clearForm();
        }
    }

    private class QuitButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Stage stage = (Stage) quitButton.getScene().getWindow();
            stage.close();
        }
    }

    private class PriceFieldKeyHandler implements EventHandler<KeyEvent> {
        @Override
        public void handle(KeyEvent event) {
            if (event.getCode() == KeyCode.ENTER) {
                System.out.println("Price entered!");
                // could add more logic here later
            }
        }
    }

    private class ButtonHoverHandler implements EventHandler<MouseEvent> {
        private final Button button;
        private final boolean isEntering;

        public ButtonHoverHandler(Button button, boolean isEntering) {
            this.button = button;
            this.isEntering = isEntering;
        }

        @Override
        public void handle(MouseEvent event) {
            if (isEntering) {
                button.setStyle("-fx-background-color: lightblue; -fx-text-fill: #2c3e50; -fx-font-weight: bold; -fx-background-radius: 5;");
            } else {
                // back to normal
                if (button == saveButton) {
                    button.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 5;");
                } else {
                    button.setStyle("-fx-background-color: #e74c3c; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 5;");
                }
            }
        }
    }

    private void clearForm() {
        productNumberField.clear();
        productDescriptionField.clear();
        productPriceField.clear();
        productNumberField.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}