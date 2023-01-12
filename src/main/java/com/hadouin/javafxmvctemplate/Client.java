package com.hadouin.javafxmvctemplate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Controller controller = new Controller(new Context("What will the string be ?"));

        MainView firstView = new MainView();
        firstView.setController(controller);
        controller.subscribe(firstView);

        MainView secondView = new MainView();
        secondView.setController(controller);
        controller.subscribe(secondView);

        firstView.show();
        secondView.setX(firstView.getX());
        secondView.setY(firstView.getY() + firstView.getHeight());
        secondView.show();

        controller.notifySubscribers();

    }

    public static void main(String[] args) {
        launch();
    }
}