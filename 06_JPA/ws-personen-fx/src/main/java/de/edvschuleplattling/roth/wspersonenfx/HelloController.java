package de.edvschuleplattling.roth.wspersonenfx;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.client5.http.fluent.Response;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpResponse;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private TableView<PersonWS> tblPersonen;
    @FXML
    private TableColumn<PersonWS, Integer> tcNr;
    @FXML
    private TableColumn<PersonWS, String> tcName;
    @FXML
    private TextField txtNr;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtSuch;
    @FXML
    private TextField txtPerson;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {

            tcNr.setCellValueFactory(new PropertyValueFactory<>("nr"));
            tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
            updatePersonen();

        } catch (IOException e) {
            zeigeFehler(e);
        }

    }

    private void zeigeFehler(Throwable e) {
        new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
    }

    private void updatePersonen() throws IOException {
        String wsUrl = "http://localhost:8080/person/alle";
        Request anfrage = Request.get(wsUrl);
        Response antwort = anfrage.execute();
        String s = antwort.returnContent().asString();
        ObjectMapper mapper = new ObjectMapper();
        PersonWS[] personWS = mapper.readValue(s, PersonWS[].class);
        tblPersonen.getItems().clear();
        tblPersonen.getItems().addAll(personWS);

    }

    public void onAnlegen(ActionEvent actionEvent) {
        try {
            int nr = Integer.parseInt(txtNr.getText());
            String name = txtName.getText();
            PersonWS person = new PersonWS(nr, name);
            ObjectMapper mapper = new ObjectMapper();
            String personJson = mapper.writeValueAsString(person);
            String wsUrl = "http://localhost:8080/person/anlegen";
            Request anfrage = Request.post(wsUrl).bodyString(personJson, ContentType.APPLICATION_JSON);
            Response antwort = anfrage.execute();
            HttpResponse httpResponse = antwort.returnResponse();
            System.out.println(httpResponse.getCode());

            updatePersonen();
        } catch (Throwable e) {
            zeigeFehler(e);
        }
    }

    public void onSuchen(ActionEvent actionEvent) {
        try {
            String such = URLEncoder.encode(txtSuch.getText(), "UTF8");
            String wsUrl = "http://localhost:8080/person/nachInhalt?inhalt=" + such;
            Request anfrage = Request.get(wsUrl);
            Response antwort = anfrage.execute();
            String s = antwort.returnContent().asString();
            ObjectMapper mapper = new ObjectMapper();
            PersonWS person = mapper.readValue(s, PersonWS.class);
            if(person.getNr()==0){
                new Alert(Alert.AlertType.INFORMATION, "Nix gefunden").show();
            }
            else {
                txtPerson.setText(person.getNr() + ": " + person.getName());
            }

        } catch (Throwable e) {
            zeigeFehler(e);
        }
    }
}