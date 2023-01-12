package com.hadouin.javafxmvctemplate;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView extends Stage implements Subscriber {
    private Controller controller;
    private Scene mainScene;
    
    private Context context;

    @FXML
    Label theLabel;
    @FXML
    TextField theTextField;
    @FXML
    Button theButton;

    public MainView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainView.fxml"));
        fxmlLoader.setControllerFactory(type -> this);
        mainScene = new Scene(fxmlLoader.load());
        this.setTitle("MainStage");
        this.setScene(mainScene);
    }

    public void setController(Controller controller){
        this.controller = controller;
    }

    @Override
    public void update(Context context) {
        this.context = context;
        updateComponents();
    }

    @FXML
    protected void onButtonClick(){
        controller.receiveNewString(theTextField.getText());
    }

    private void updateComponents() {
        theLabel.setText(context.getTheString());
    }
}
