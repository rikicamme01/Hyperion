package com.example.hyperion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

public class NRicercaController implements Initializable {
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
    private TextField keyword1G1;
    @FXML
    private Button btKeyword1G1;

    @FXML
    private TextField keyword2G1;
    @FXML
    private Button btKeyword2G1;
    @FXML
    private TextField keyword3G1;
    @FXML
    private Button btKeyword3G1;
    @FXML
    private TextField keyword4G1;
    @FXML
    private Button btKeyword4G1;
    @FXML
    private TextField keyword5G1;
    @FXML
    private Button btKeyword5G1;
    @FXML
    private TextField keyword6G1;
    @FXML
    private TextField utente1G1;
    @FXML
    private TextField utente2G1;
    @FXML
    private Button btOrUtenteG1;
    @FXML
    private Button btLessUtenteG1;
    @FXML
    private ChoiceBox<String> localitàG1;
    @FXML
    private ChoiceBox<String> linguaG1;
    @FXML
    private DatePicker fromG1;
    @FXML
    private DatePicker toG1;
    int num_reply;
    int num_tweet;
    SimpleDateFormat dtf;

    private String[] località = {"Belluno", "Padova", "Rovigo", "Treviso", "Venezia", "Verona", "Vicenza"};
    private String[] lingue = {"Italian", "English", "French", "German", "Spanish"};
    FileChooser fileChooser = new FileChooser();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        twitterTemplate.setOpacity(0);
        btSalvaCome.setVisible(false);
        num_tweet = 3;
        num_reply = 50;
        dtf = new SimpleDateFormat("HH:mm · MMM dd, yyyy");

        localitàG1.getItems().addAll(località);
        linguaG1.getItems().addAll(lingue);

        keyword2G1.setVisible(false);
        btKeyword2G1.setVisible(false);
        keyword3G1.setVisible(false);
        btKeyword3G1.setVisible(false);
        keyword4G1.setVisible(false);
        btKeyword4G1.setVisible(false);
        keyword5G1.setVisible(false);
        btKeyword5G1.setVisible(false);
        keyword6G1.setVisible(false);

        utente2G1.setVisible(false);
        btLessUtenteG1.setVisible(false);
    }


    public void cerca(ActionEvent actionEvent) {
        StringBuilder query = new StringBuilder();
        btSalvaCome.setVisible(true);
        twitterTemplate.setOpacity(1);
        Date date = new Date();
        lbOrarioTemplate.setText(dtf.format(date));
        num_tweet++;
        num_reply++;
        if(num_tweet < 5){
            lbTemplate.setText("Sono stai trovati solo " + num_tweet +" Tweet.\nProva a modificare i filtri");
        }
        else {
            lbTemplate.setText("Sono stati trovati " + num_tweet + " Tweet\ne " + num_reply + " commenti");
        }


        String[] paroleChiave = {keyword2G1.getText(), keyword3G1.getText(), keyword4G1.getText(), keyword5G1.getText(), keyword6G1.getText() };
        query.append(keyword1G1.getText());
        for (String kw: paroleChiave) {
            if(!kw.isEmpty()){
                query.append(" OR "+ kw);
            }
        }
        System.out.println(query);
    }

   public void salvaCome(ActionEvent event) {
        String formatDateFrom = fromG1.getValue().format(DateTimeFormatter.ofPattern("dd"));
       String formatDateTo = toG1.getValue().format(DateTimeFormatter.ofPattern("dd"));
        String nomeExcel = "Calcolo_Output_" + formatDateFrom + "-" + formatDateTo;
      fileChooser.setTitle("Salva query");
      fileChooser.setInitialFileName(nomeExcel);
      fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Foglio Excel", "*.xlsx"));
    }



    public void orUtenteG1(ActionEvent actionEvent) {
        utente2G1.setVisible(true);
        btLessUtenteG1.setVisible(true);
        btOrUtenteG1.setText("OR");
        btOrUtenteG1.setStyle("-fx-background-color: white ");

    }

    public void lessUtenteG1(ActionEvent actionEvent) {
        utente2G1.setVisible(false);
        btLessUtenteG1.setVisible(false);
        utente2G1.clear();
        btOrUtenteG1.setText("+");
    }

    public void keyword1G1(ActionEvent actionEvent) {
        btKeyword1G1.setText("or");
        btKeyword1G1.setStyle("-fx-background-color:  white");
        keyword2G1.setVisible(true);
        btKeyword2G1.setVisible(true);
    }

    public void keyword2G1(ActionEvent actionEvent) {
        btKeyword2G1.setText("or");
        btKeyword2G1.setStyle("-fx-background-color:  white");
        keyword3G1.setVisible(true);
        btKeyword3G1.setVisible(true);
    }

    public void keyword3G1(ActionEvent actionEvent) {
        btKeyword3G1.setText("or");
        btKeyword3G1.setStyle("-fx-background-color:  white");
        keyword4G1.setVisible(true);
        btKeyword4G1.setVisible(true);
    }


    public void keyword4G1(ActionEvent actionEvent) {
        btKeyword4G1.setText("or");
        btKeyword4G1.setStyle("-fx-background-color:  white");
        keyword5G1.setVisible(true);
        btKeyword5G1.setVisible(true);
    }

    public void keyword5G1(ActionEvent actionEvent) {
        btKeyword5G1.setText("or");
        btKeyword5G1.setStyle("-fx-background-color:  white");
        keyword6G1.setVisible(true);
    }
}
