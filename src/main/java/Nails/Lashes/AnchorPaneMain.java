package Nails.Lashes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;


public class AnchorPaneMain {
    @FXML
    private StackPane stackPane;

    @FXML
    public void initialize() {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Menu1Pane.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();

        } catch (IOException e) {
            e.printStackTrace();
        }
        addPane(pane);
        Menu1Pane menu1Pane = loader.getController();
        menu1Pane.setAnchorPaneMain(this);
    }

    @FXML
    public void addPane(Pane pane) {
        stackPane.getChildren().clear();
        stackPane.getChildren().add(pane);
    }

    @FXML
    public void exitButtonOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        initialize();
    }
}

