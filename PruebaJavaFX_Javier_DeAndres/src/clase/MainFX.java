package clase;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import vista.ControlFX;

public class MainFX extends Application {
	private Stage primaryStage;
    private BorderPane send;

	@Override
	public void start(Stage primaryStage) {
		 this.primaryStage = primaryStage;
	     this.primaryStage.setTitle("PruebaJavaFX_Javier_DeAndres");

	        initSend();

	        showProfile();
	}

	public void initSend() {
		// TODO Auto-generated method stub
        try {
        	FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFX.class.getResource("vista/Send.fxml"));
			send = (BorderPane) loader.load();
			 Scene scene = new Scene(send);
		        primaryStage.setScene(scene);
		        primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void showProfile() {
		// TODO Auto-generated method stub
		try {
			FXMLLoader loader = new FXMLLoader();
	         loader.setLocation(MainFX.class.getResource("vista/Profile.fxml"));
	         AnchorPane profile = (AnchorPane) loader.load();
	         send.setCenter(profile);
	         ControlFX controller = loader.getController();
	         controller.setMainApp(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 public Stage getPrimaryStage() {
	        return primaryStage;
	    }


	public static void main(String[] args) {
		launch(args);
	}
}
