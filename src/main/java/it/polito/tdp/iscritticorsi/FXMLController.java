package it.polito.tdp.iscritticorsi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.iscritticorsi.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

//controller del turno 1 --> modificare per turno 2

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtMatricola;

    @FXML
    private Color x1;

    @FXML
    private Button btnElencoCorsi;

    @FXML
    private Button btnStudentiSimili;

    @FXML
    private TextArea txtResult;

    @FXML
    void initialize() {
        assert txtMatricola != null : "fx:id=\"txtMatricola\" was not injected: check your FXML file 'iscrittiT1.fxml'.";
        assert x1 != null : "fx:id=\"x1\" was not injected: check your FXML file 'iscrittiT1.fxml'.";
        assert btnElencoCorsi != null : "fx:id=\"btnElencoCorsi\" was not injected: check your FXML file 'iscrittiT1.fxml'.";
        assert btnStudentiSimili != null : "fx:id=\"btnStudentiSimili\" was not injected: check your FXML file 'iscrittiT1.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'iscrittiT1.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}