package com.example.hyperion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class NRicercaController {


    @FXML
    public Button btCerca;
    @FXML
    public Label lbOrarioTemplate;
    @FXML
    public Button btSalvaCome;
    @FXML
    private Pane twitterTemplate;

    @FXML
    private Label lbTemplate;
    @FXML
    private TextField tfProva;
    @FXML
    private Pane PanePadre;
    @FXML
    private Pane PaneFiglio;
    int num_tweet = 12;
    int num_reply = 50;
    SimpleDateFormat dtf = new SimpleDateFormat("HH:mm · MMM dd, yyyy");

    public void cerca(ActionEvent actionEvent) {
        twitterTemplate.setOpacity(1);
        Date date = new Date();
        lbOrarioTemplate.setText(dtf.format(date));
        num_tweet++;
        num_reply++;
        lbTemplate.setText("Sono stati trovati " + num_tweet + " Tweet\ne " + num_reply + " commenti");


        PanePadre.setVisible(false);
        //tfProva.clear();
    }

    public void salvaCome(ActionEvent actionEvent) {
        System.out.println("pressed salvaCome");

        //PanePadre.getChildren().add(PaneFiglio);
        //devo pulire i singoli nodi:

        PanePadre.setVisible(true);

    }
}
