package Nails.Lashes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Menu1Pane {
    @FXML
    private Button tabelkaButton, menu3Button;

    private AnchorPaneMain anchorPaneMain;
    public void setAnchorPaneMain(AnchorPaneMain anchorPaneMain) {
        this.anchorPaneMain = anchorPaneMain;
    }




    public void tabelkaButtonOnAction(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Menu2Pane.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        anchorPaneMain.addPane(pane);
    }

    public void menu3Button(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Menu3Pane.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        anchorPaneMain.addPane(pane);
    }

    public void tabelkaButtonOnPressed(MouseEvent mouseEvent) {
        tabelkaButton.setStyle("-fx-background-color: #c822b6; -fx-background-radius: 30;");
    }

    public void menu3ButtonPressed(MouseEvent mouseEvent) {
        menu3Button.setStyle("-fx-background-color: #c822b6; -fx-background-radius: 30;");
    }
}
