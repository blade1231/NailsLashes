package Nails.Lashes;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Menu2Pane {
    @FXML
    private Button button1Write;
    @FXML
    private Button button2Write;

    @FXML
    public void ButtonWrite1OnMouseReleased(MouseEvent mouseEvent) {
        button1Write.setStyle("-fx-background-color: #FF15B4; -fx-background-radius: 40;");
    }
@FXML
    public void ButtonWrite2OnMousePressed(MouseEvent mouseEvent) {
    button2Write.setStyle("-fx-background-color: #c822b6; -fx-background-radius: 40;");
    }
@FXML
    public void ButtonWrite2OnMouseReleased(MouseEvent mouseEvent) {
    button2Write.setStyle("-fx-background-color: #FF15B4; -fx-background-radius: 40;");
    }
@FXML
    public void ButtonWrite1OnMousePressed(MouseEvent mouseEvent) {
        button1Write.setStyle("-fx-background-color: #c822b6; -fx-background-radius: 40;");

    }
}
