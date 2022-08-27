package com.example.hyperion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;

public class HelloController {
    private Node view1;
    private Node view2;
    private Node view3;
    private Node view4;

    public HelloController() throws IOException {
        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("NRicerca-view.fxml"));
        view1 = fxmlLoader1.load();

        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("ATwitter.fxml"));
        view2 = fxmlLoader2.load();

        FXMLLoader fxmlLoader3 = new FXMLLoader(HelloApplication.class.getResource("Button.fxml"));
        view3 = fxmlLoader3.load();

        FXMLLoader fxmlLoader4 = new FXMLLoader(HelloApplication.class.getResource("Info.fxml"));
        view4 = fxmlLoader4.load();

    }

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button btButton;
    @FXML
    private ImageView btInfo;
    @FXML
    private ImageView ImTwitter;

    @FXML
    private Button btNuovaRicerca;
    @FXML
    private Button btTwitterAccount;

    @FXML
    void nuovaRicerca(ActionEvent event) throws IOException {

        borderPane.setCenter(view1);

    }
    @FXML
    void twitterAccount(ActionEvent event) {

        borderPane.setCenter(view2);
    }
    @FXML
    void button(ActionEvent event) {

        borderPane.setCenter(view3);
    }
    @FXML
    void info(MouseEvent event) {
        borderPane.setCenter(view4);
    }

    public void collegamentoTwitter(MouseEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://twitter.com/home?lang=it"));
    }
}
