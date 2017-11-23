
	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Group;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.stage.Stage;

	public class Aplicacion extends Application {
		public static void main (String []args) {
			launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
		 Parent root= FXMLLoader.load(getClass().getResource("/FXml/Main.fxml"));
		 Scene scene = new Scene(root,600,600);
		 primaryStage.setScene(scene);
		 primaryStage.setTitle("CONSOLA");
		 primaryStage.show();
		 
		
			
		}

	}



