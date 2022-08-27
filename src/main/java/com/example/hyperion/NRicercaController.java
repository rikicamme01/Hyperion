package com.example.hyperion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

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
    private Pane twitterTemplate;

    @FXML
    private Label lbTemplate;
    int num_tweet = 12;
    int num_reply = 50;

    SimpleDateFormat dtf = new SimpleDateFormat("HH:mm · MMM dd, yyyy");

    public void cerca(ActionEvent actionEvent) {
        twitterTemplate.setOpacity(1);
        Date date = new Date();
        num_tweet++;
        num_reply++;
        lbTemplate.setText("Sono stati trovati " + num_tweet + " Tweet\ne " + num_reply + " commenti");
        lbOrarioTemplate.setText(dtf.format(date));
    }
}
