package vista;

import clase.MainFX;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ControlFX {
	@FXML
	private ImageView image1;
	@FXML
	private ImageView image2;
	@FXML
	private ImageView image3;
	@FXML
	private Label myProfileLabel;
	@FXML
	private Label JayRLabel;
	@FXML
	private Label ProgrammerscanDesignLabel;
	@FXML
	private MenuBar menuBar1;
	@FXML
	private MenuBar menuBar2;
	@FXML
	private TextField texto;
	@FXML
	private Label nombreLabel;
	@FXML
	private Label apellidoLabel;
	@FXML
	private Label deporteLabel;
	@FXML
	private Label comidaLabel;
	@FXML
	private TextField nombreTexto;
	@FXML
	private TextField apellidoTexto;
	@FXML
	private TextField deporteTexto;
	@FXML
	private TextField comidaTexto;
	
	
	   private MainFX mainFX;
	   
	   public ControlFX() {
		   
	    }

	   public void setMainApp(MainFX mainApp) {
	        this.mainFX = mainApp;	
	        }
	   
}